package aesahaettr.services.objets;

import java.util.Collection;

import aesahaettr.ui.bean.objets.ObjetFullDto;
import aesahaettr.ui.bean.objets.ObjetListItemDto;
import aesahaettr.ui.bean.objets.ObjetMinimalDto;

public interface IObjetsServices {

    Collection<ObjetListItemDto> findAll();

    ObjetFullDto save(ObjetMinimalDto dto);

    ObjetFullDto update(ObjetMinimalDto dto);

    ObjetFullDto getById(String id);

}
