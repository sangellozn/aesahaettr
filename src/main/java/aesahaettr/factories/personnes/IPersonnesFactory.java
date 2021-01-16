package aesahaettr.factories.personnes;

import aesahaettr.ui.bean.personnes.PersonneCreateDto;
import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;
import aesahaettr.xml.bean.Personne;

public interface IPersonnesFactory {

    PersonneListItemDto mapToListItemDto(Personne bean);

    Personne mapToBean(PersonneCreateDto dto);

    PersonneCreateDto mapToCreateDto(Personne bean);

    PersonneFullDto mapToFullDto(Personne bean);

}
