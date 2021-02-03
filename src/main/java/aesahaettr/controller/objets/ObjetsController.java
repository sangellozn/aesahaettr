package aesahaettr.controller.objets;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.objets.IObjetsServices;
import aesahaettr.ui.bean.objets.ObjetFullDto;
import aesahaettr.ui.bean.objets.ObjetListItemDto;
import aesahaettr.ui.bean.objets.ObjetMinimalDto;

@RestController
@RequestMapping("api/objets")
public class ObjetsController {

    @Autowired
    private IObjetsServices objetsServices;

    @GetMapping
    public Collection<ObjetListItemDto> findAll() {
        return this.objetsServices.findAll();
    }

    @PostMapping
    public ObjetFullDto save(@RequestBody ObjetMinimalDto dto) {
        return this.objetsServices.save(dto);
    }

    @PutMapping("{id}")
    public ObjetFullDto update(@RequestBody ObjetMinimalDto dto) {
        return this.objetsServices.update(dto);
    }

    @GetMapping("{id}")
    public ObjetFullDto getById(@PathVariable String id) {
        return this.objetsServices.getById(id);
    }

}
