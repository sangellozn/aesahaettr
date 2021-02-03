package aesahaettr.factories;

import aesahaettr.ui.bean.LocalisationDto;
import aesahaettr.xml.bean.Adresse;
import aesahaettr.xml.bean.Localisation;

public interface ILocalisationsFactory {

    Adresse mapDtoToNewAdresseBean(LocalisationDto dto);

    Localisation mapDtoToNewLocalisationBean(LocalisationDto dto, Adresse adresse);

    LocalisationDto mapToDto(Localisation localisation, String id);

    void updateBean(Adresse adresse, LocalisationDto dto);

    void updateBean(Localisation localisation, LocalisationDto dto);

}
