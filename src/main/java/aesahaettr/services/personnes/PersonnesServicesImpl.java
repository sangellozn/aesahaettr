package aesahaettr.services.personnes;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.exceptions.personnes.PersonneNotFoundException;
import aesahaettr.factories.personnes.IPersonnesFactory;
import aesahaettr.ui.bean.personnes.PersonneCreateDto;
import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;
import aesahaettr.xml.bean.Personne;

@Service
public class PersonnesServicesImpl implements IPersonnesServices {

    @Autowired
    private IPersonnesFactory personnesFactory;

    @Override
    public Collection<PersonneListItemDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getPersonnes().getPersonne().stream()
                .map(this.personnesFactory::mapToListItemDto).collect(Collectors.toList());
    }

    @Override
    public PersonneCreateDto save(PersonneCreateDto dto) {
        Personne personne = this.personnesFactory.mapToBean(dto);

        AesahaettrXmlInstance.getInstance().getPersonnes().getPersonne().add(personne);

        AesahaettrXmlInstance.save();

        return this.personnesFactory.mapToCreateDto(personne);
    }

    private Optional<Personne> findByIdInternal(String id) {
        return AesahaettrXmlInstance.getInstance().getPersonnes().getPersonne().stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }


    @Override
    public PersonneFullDto getById(String id) {
        Personne personne = this.findByIdInternal(id).orElseThrow(() -> new PersonneNotFoundException(id));

        return this.personnesFactory.mapToFullDto(personne);
    }

}
