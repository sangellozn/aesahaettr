package aesahaettr.controller.personnes;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.personnes.IPersonnesServices;
import aesahaettr.ui.bean.personnes.PersonneFullDto;
import aesahaettr.ui.bean.personnes.PersonneListItemDto;
import aesahaettr.ui.bean.personnes.PersonneMinimalDto;

@RestController
@RequestMapping("api/personnes")
public class PersonnesController {

    @Autowired
    private IPersonnesServices personnesServices;

    @GetMapping
    public Collection<PersonneListItemDto> findAll() {
        return this.personnesServices.findAll();
    }

    @PostMapping
    public PersonneMinimalDto save(@RequestBody PersonneMinimalDto dto) {
        return this.personnesServices.save(dto);
    }

    @PutMapping("{id}")
    public PersonneFullDto update(@RequestBody PersonneMinimalDto dto) {
        return this.personnesServices.update(dto);
    }

    @GetMapping("{id}")
    public PersonneFullDto getById(@PathVariable String id) {
        return this.personnesServices.getById(id);
    }

}
