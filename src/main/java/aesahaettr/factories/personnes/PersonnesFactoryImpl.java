package aesahaettr.factories.personnes;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import aesahaettr.displayer.AdresseDisplayer;
import aesahaettr.finder.ObjectFinder;
import aesahaettr.ui.bean.LocalisationEnum;
import aesahaettr.ui.bean.personnes.LocalisationDto;
import aesahaettr.ui.bean.personnes.PersonneCreateDto;
import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;
import aesahaettr.xml.bean.ContactList;
import aesahaettr.xml.bean.EvenementIdList;
import aesahaettr.xml.bean.Localisation;
import aesahaettr.xml.bean.LocalisationList;
import aesahaettr.xml.bean.Personne;
import aesahaettr.xml.bean.PossessionList;
import aesahaettr.xml.bean.RelationList;

@Component
public class PersonnesFactoryImpl implements IPersonnesFactory {

    @Override
    public PersonneListItemDto mapToListItemDto(Personne bean) {
        PersonneListItemDto resultat = new PersonneListItemDto();

        resultat.setId(bean.getId());
        resultat.setNomUsage(bean.getNomUsage());
        resultat.setPrenomUsage(bean.getPrenomUsage());

        Optional<Localisation> localisationOpt = bean.getLocalisations()
                .getLocalisation().stream()
                .filter(item -> EnumSet.of(LocalisationEnum.RESIDE, LocalisationEnum.SITUE).contains(LocalisationEnum.valueOf(item.getTypeLocalisationCode())))
                .findFirst();

        if (localisationOpt.isPresent()) {
            resultat.setLocalisation(AdresseDisplayer.getAdresseDisplay(ObjectFinder.getAdresseById(localisationOpt.get().getAdresseId())));
        }

        return resultat;
    }

    @Override
    public PersonneCreateDto mapToCreateDto(Personne bean) {
        PersonneCreateDto resultat = new PersonneCreateDto();

        resultat.setId(bean.getId());
        resultat.setCommentaire(bean.getCommentaire());
        resultat.setNom(bean.getNom());
        resultat.setNomUsage(bean.getNomUsage());
        resultat.setPrenoms(bean.getPrenoms());
        resultat.setPrenomUsage(bean.getPrenomUsage());

        return resultat;
    }

    @Override
    public Personne mapToBean(PersonneCreateDto dto) {
        Personne resultat = new Personne();

        resultat.setCommentaire(dto.getCommentaire());
        resultat.setContacts(new ContactList());
        resultat.setDateCreation(LocalDateTime.now());
        resultat.setEvenementIds(new EvenementIdList());
        resultat.setId(UUID.randomUUID().toString());
        resultat.setLocalisations(new LocalisationList());
        resultat.setNom(dto.getNom());
        resultat.setNomUsage(dto.getNomUsage());
        resultat.setPossessions(new PossessionList());
        resultat.setPrenoms(dto.getPrenoms());
        resultat.setPrenomUsage(dto.getPrenomUsage());
        resultat.setRelations(new RelationList());

        return resultat;
    }

    @Override
    public PersonneFullDto mapToFullDto(Personne bean) {
        PersonneFullDto resultat = new PersonneFullDto();

        resultat.setId(bean.getId());
        resultat.setCommentaire(bean.getCommentaire());
        resultat.setNom(bean.getNom());
        resultat.setNomUsage(bean.getNomUsage());
        resultat.setPrenoms(bean.getPrenoms());
        resultat.setPrenomUsage(bean.getPrenomUsage());
        resultat.setDateCreation(bean.getDateCreation());
        resultat.setDateModification(bean.getDateModification());
        resultat.setLocalisations(new ArrayList<>());

        LocalisationDto e = new LocalisationDto();
        e.setAdresseId(null);
        e.setCodePostal("91190");
        e.setDateDebut(LocalDateTime.now());
        e.setDateFin(LocalDateTime.now().plus(1, ChronoUnit.DAYS));
        e.setLieuDit("La passoire");
        e.setLigne1("Ligne 1");
        e.setLigne2("Ligne 2");
        e.setLocaliteDestination("GIF-SUR-YVETTE");
        e.setPaysCode("FR");
        e.setPaysLibelle("France");
        e.setTypeLocalisationCode("RESIDE");
        e.setTypeLocalisationLibelle("Réside");

        resultat.getLocalisations().add(e);

        return resultat;
    }

}
