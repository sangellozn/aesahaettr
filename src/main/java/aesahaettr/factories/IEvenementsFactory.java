package aesahaettr.factories;

import aesahaettr.ui.bean.EvenementDto;
import aesahaettr.xml.bean.Evenement;
import aesahaettr.xml.bean.Personne;

public interface IEvenementsFactory {

    Evenement mapDtoToNewBean(EvenementDto dto);

    EvenementDto mapToDto(Evenement bean, Personne personne);

    void updateBean(Evenement bean, EvenementDto dto);

}
