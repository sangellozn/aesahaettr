package aesahaettr.controller.ref.type;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.type.IRefTypeContactServices;
import aesahaettr.ui.bean.ref.type.RefTypeContactDto;

@RestController
@RequestMapping("api/ref/type/contact")
public class RefTypeContactController {

    @Autowired
    private IRefTypeContactServices refTypeContactServices;

    @GetMapping
    public Collection<RefTypeContactDto> getAll() {
        return this.refTypeContactServices.findAll();
    }

    @PostMapping
    public void save(@RequestBody RefTypeContactDto dto) {
        this.refTypeContactServices.save(dto);
    }

}
