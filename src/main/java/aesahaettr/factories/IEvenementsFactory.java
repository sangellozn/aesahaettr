package aesahaettr.factories;

import aesahaettr.ui.bean.EvenementDto;
import aesahaettr.xml.bean.Evenement;

public interface IEvenementsFactory {

    Evenement mapDtoToNewBean(EvenementDto dto);

    EvenementDto mapToDto(Evenement bean, String id);

    void updateBean(Evenement bean, EvenementDto dto);

}
