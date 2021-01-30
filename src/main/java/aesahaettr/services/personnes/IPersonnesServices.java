package aesahaettr.services.personnes;

import java.util.Collection;

import aesahaettr.ui.bean.personnes.PersonneMinimalDto;
import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;

public interface IPersonnesServices {

    Collection<PersonneListItemDto> findAll();

    PersonneMinimalDto save(PersonneMinimalDto dto);

    PersonneFullDto update(PersonneMinimalDto dto);

    PersonneFullDto getById(String id);

}
