package aesahaettr.controller.ref.type;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.type.IRefTypeRelationServices;
import aesahaettr.ui.bean.ref.type.RefTypeRelationDto;

@RestController
@RequestMapping("api/ref/type/relation")
public class RefTypeRelationController {

    @Autowired
    private IRefTypeRelationServices refTypeRelationServices;

    @GetMapping
    public Collection<RefTypeRelationDto> getAll() {
        return this.refTypeRelationServices.findAll();
    }

    @PostMapping
    public void save(@RequestBody RefTypeRelationDto dto) {
        this.refTypeRelationServices.save(dto);
    }

}
