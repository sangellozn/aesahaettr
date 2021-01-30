package aesahaettr.factories.personnes;

import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;
import aesahaettr.ui.bean.personnes.PersonneMinimalDto;
import aesahaettr.xml.bean.Personne;

public interface IPersonnesFactory {

    PersonneListItemDto mapToListItemDto(Personne bean);

    Personne mapToNewBean(PersonneMinimalDto dto);

    void updateBean(Personne bean, PersonneMinimalDto dto);

    PersonneMinimalDto mapToCreateDto(Personne bean);

    PersonneFullDto mapToFullDto(Personne bean);

}
