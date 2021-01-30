package aesahaettr.services.personnes;

import aesahaettr.ui.bean.personnes.LocalisationDto;

public interface ILocalisationsServices {

    LocalisationDto save(LocalisationDto dto);

    LocalisationDto update(LocalisationDto dto);

}
