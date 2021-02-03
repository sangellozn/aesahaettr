package aesahaettr.factories.objets;

import aesahaettr.ui.bean.objets.ObjetFullDto;
import aesahaettr.ui.bean.objets.ObjetListItemDto;
import aesahaettr.ui.bean.objets.ObjetMinimalDto;
import aesahaettr.xml.bean.Objet;
import aesahaettr.xml.bean.Possession;

public interface IObjetsFactory {

    ObjetListItemDto mapToListItemDto(Objet bean);

    ObjetFullDto mapToFullDto(Objet bean);

    Objet mapToNewBean(ObjetMinimalDto dto);

    Possession mapToNewPossessionBean(ObjetMinimalDto dto, String objetId);

    void updateBean(Objet objet, ObjetMinimalDto dto);

}
