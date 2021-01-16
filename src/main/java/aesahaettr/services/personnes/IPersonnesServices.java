package aesahaettr.services.personnes;

import java.util.Collection;

import aesahaettr.ui.bean.personnes.PersonneCreateDto;
import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;

public interface IPersonnesServices {

    Collection<PersonneListItemDto> findAll();

    PersonneCreateDto save(PersonneCreateDto dto);

    PersonneFullDto getById(String id);

}
