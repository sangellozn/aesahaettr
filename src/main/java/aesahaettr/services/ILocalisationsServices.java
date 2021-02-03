package aesahaettr.services;

import aesahaettr.ui.bean.LocalisationDto;

public interface ILocalisationsServices {

    LocalisationDto saveForPersonne(LocalisationDto dto);

    LocalisationDto updateForPersonne(LocalisationDto dto);

    LocalisationDto saveForObjet(LocalisationDto dto);

    LocalisationDto updateForObjet(LocalisationDto dto);

}
