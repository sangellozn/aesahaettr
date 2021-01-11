package aesahaettr.controller.ref;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public void save(@RequestBody PaysDto pays) {
        this.paysServices.save(pays);
    }

}
