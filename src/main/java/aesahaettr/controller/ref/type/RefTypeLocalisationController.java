package aesahaettr.controller.ref.type;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.type.IRefTypeLocalisationServices;
import aesahaettr.ui.bean.ref.type.RefTypeLocalisationDto;

@RestController
@RequestMapping("api/ref/type/localisation")
public class RefTypeLocalisationController {

    @Autowired
    private IRefTypeLocalisationServices refTypeLocalisationServices;

    @GetMapping
    public Collection<RefTypeLocalisationDto> getAll() {
        return this.refTypeLocalisationServices.findAll();
    }

    @PostMapping
    public void save(@RequestBody RefTypeLocalisationDto dto) {
        this.refTypeLocalisationServices.save(dto);
    }

}
