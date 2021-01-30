package aesahaettr.factories.personnes;

import java.util.UUID;

import org.springframework.stereotype.Component;

import aesahaettr.finder.ObjectFinder;
import aesahaettr.ui.bean.personnes.LocalisationDto;
import aesahaettr.xml.bean.Adresse;
import aesahaettr.xml.bean.Localisation;
import aesahaettr.xml.bean.Personne;

@Component
public class LocalisationsFactoryImpl implements ILocalisationsFactory {

    @Override
    public Adresse mapDtoToNewAdresseBean(LocalisationDto dto) {
        Adresse adresse = new Adresse();

        adresse.setCodePostal(dto.getCodePostal());
        adresse.setId(UUID.randomUUID().toString());
        adresse.setLieuDit(dto.getLieuDit());
        adresse.setLigne1(dto.getLigne1());
        adresse.setLigne2(dto.getLigne2());
        adresse.setLigne3(dto.getLigne3());
        adresse.setLocaliteDestination(dto.getLocaliteDestination());
        adresse.setPaysCode(dto.getPaysCode());

        return adresse;
    }

    @Override
    public Localisation mapDtoToNewLocalisationBean(LocalisationDto dto, Adresse adresse) {
        Localisation localisation = new Localisation();

        localisation.setAdresseId(adresse.getId());
        localisation.setDateDebut(dto.getDateDebut());
        localisation.setDateFin(dto.getDateFin());
        localisation.setId(UUID.randomUUID().toString());
        localisation.setTypeLocalisationCode(dto.getTypeLocalisationCode());

        return localisation;
    }

    @Override
    public LocalisationDto mapToDto(Localisation localisation, Personne personne) {
        LocalisationDto dto = new LocalisationDto();

        Adresse adresse = ObjectFinder.getAdresseById(localisation.getAdresseId());

        dto.setAdresseId(localisation.getAdresseId());
        dto.setCodePostal(adresse.getCodePostal());
        dto.setDateDebut(localisation.getDateDebut());
        dto.setDateFin(localisation.getDateFin());
        dto.setId(localisation.getId());
        dto.setLieuDit(adresse.getLieuDit());
        dto.setLigne1(adresse.getLigne1());
        dto.setLigne2(adresse.getLigne2());
        dto.setLigne3(adresse.getLigne3());
        dto.setLocaliteDestination(adresse.getLocaliteDestination());
        dto.setPaysCode(adresse.getPaysCode());
        dto.setPaysLibelle(ObjectFinder.getPaysByCode(adresse.getPaysCode()).getLibelle());
        dto.setPersonneId(personne.getId());
        dto.setTypeLocalisationCode(localisation.getTypeLocalisationCode());
        dto.setTypeLocalisationLibelle(ObjectFinder.getTypeLocalisationByCode(localisation.getTypeLocalisationCode()).getLibelle());

        return dto;
    }

}
