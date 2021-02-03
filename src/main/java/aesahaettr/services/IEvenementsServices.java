package aesahaettr.services;

import aesahaettr.ui.bean.EvenementDto;

public interface IEvenementsServices {

    EvenementDto saveForPersonne(EvenementDto dto);

    EvenementDto update(EvenementDto dto);

    EvenementDto saveForObjet(EvenementDto dto);


}
