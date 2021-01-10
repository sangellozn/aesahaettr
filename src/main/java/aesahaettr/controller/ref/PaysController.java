package aesahaettr.controller.ref;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.IPaysServices;
import aesahaettr.ui.bean.ref.PaysDto;

@RestController
@RequestMapping("api/ref/pays")
public class PaysController {

    @Autowired
    private IPaysServices paysServices;

    @GetMapping
    public Collection<PaysDto> getAll() {
        return this.paysServices.findAll();
    }

    @GetMapping("/{id}")
    public PaysDto getById(@PathVariable("id") String id) {
        return this.paysServices.getById(id);
    }

}
