package aesahaettr.factories.objets;

import java.time.Instant;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import aesahaettr.displayer.ObjectDisplayer;
import aesahaettr.factories.IEvenementsFactory;
import aesahaettr.factories.ILocalisationsFactory;
import aesahaettr.finder.ObjectFinder;
import aesahaettr.ui.bean.LocalisationEnum;
import aesahaettr.ui.bean.objets.ObjetFullDto;
import aesahaettr.ui.bean.objets.ObjetListItemDto;
import aesahaettr.ui.bean.objets.ObjetMinimalDto;
import aesahaettr.xml.bean.EvenementIdList;
import aesahaettr.xml.bean.Localisation;
import aesahaettr.xml.bean.LocalisationList;
import aesahaettr.xml.bean.Objet;
import aesahaettr.xml.bean.Personne;
import aesahaettr.xml.bean.Possession;

@Component
public class ObjetsFactoryImpl implements IObjetsFactory {

    @Autowired
    private ILocalisationsFactory localisationsFactory;

    @Autowired
    private IEvenementsFactory evenementsFactory;

    @Override
    public ObjetListItemDto mapToListItemDto(Objet bean) {
        ObjetListItemDto dto = new ObjetListItemDto();

        dto.setDescription(bean.getDescription());
        dto.setId(bean.getId());

        Optional<Localisation> localisationOpt = bean.getLocalisations()
                .getLocalisation().stream()
                .filter(item -> EnumSet.of(LocalisationEnum.SITUE).contains(LocalisationEnum.valueOf(item.getTypeLocalisationCode())))
                .filter(item -> item.getDateFin() == null)
                .findFirst();

        if (localisationOpt.isPresent()) {
            dto.setLocalisation(ObjectDisplayer.getAdresseDisplay(ObjectFinder.getAdresseById(localisationOpt.get().getAdresseId())));
        }

        Optional<Personne> possesseur = ObjectFinder.getPersonnePossesseurByObjetId(bean.getId());
        if (possesseur.isPresent()) {
            dto.setPossesseur(ObjectDisplayer.getPersonneDisplay(possesseur.get()));
        }

        dto.setNom(bean.getNom());

        return dto;
    }

    @Override
    public ObjetFullDto mapToFullDto(Objet bean) {
        ObjetFullDto dto = new ObjetFullDto();

        dto.setId(bean.getId());
        dto.setDateCreation(bean.getDateCreation());
        dto.setDateModification(bean.getDateModification());
        dto.setNom(bean.getNom());
        dto.setDescription(bean.getDescription());
        dto.setTypeObjetCode(bean.getTypeObjetCode());

        dto.setEvenements(bean.getEvenementIds().getEvenementId().stream()
                .map(ObjectFinder::getEvenementById)
                .map(item -> this.evenementsFactory.mapToDto(item, bean.getId()))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
        dto.setLocalisations(bean.getLocalisations().getLocalisation().
                stream().map(item -> this.localisationsFactory.mapToDto(item, bean.getId())).collect(Collectors.toList()));

        return dto;
    }

    @Override
    public Objet mapToNewBean(ObjetMinimalDto dto) {
        Objet objet = new Objet();

        objet.setDateCreation(Instant.now());
        objet.setDescription(dto.getDescription());
        objet.setEvenementIds(new EvenementIdList());
        objet.setId(UUID.randomUUID().toString());
        objet.setLocalisations(new LocalisationList());
        objet.setNom(dto.getNom());
        objet.setTypeObjetCode(dto.getTypeObjetCode());

        return objet;
    }

    @Override
    public Possession mapToNewPossessionBean(ObjetMinimalDto dto, String objetId) {
        Possession possession = new Possession();

        possession.setDateDebut(dto.getDateDebut());
        possession.setDateFin(dto.getDateFin());
        possession.setObjetId(objetId);
        possession.setTypeAppartenanceCode(dto.getTypeAppartenanceCode());

        return possession;
    }

    @Override
    public void updateBean(Objet objet, ObjetMinimalDto dto) {
        objet.setDateModification(Instant.now());
        objet.setDescription(dto.getDescription());
        objet.setNom(dto.getNom());
        objet.setTypeObjetCode(dto.getTypeObjetCode());
    }

}
