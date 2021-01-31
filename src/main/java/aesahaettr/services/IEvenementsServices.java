package aesahaettr.services;

import aesahaettr.ui.bean.EvenementDto;

public interface IEvenementsServices {

    EvenementDto saveForPersonne(EvenementDto dto);

    EvenementDto updateForPersonne(EvenementDto dto);

}
