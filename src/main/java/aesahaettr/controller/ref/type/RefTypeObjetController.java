package aesahaettr.controller.ref.type;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.type.IRefTypeObjetServices;
import aesahaettr.ui.bean.ref.type.RefTypeObjetDto;

@RestController
@RequestMapping("api/ref/type/objet")
public class RefTypeObjetController {

    @Autowired
    private IRefTypeObjetServices refTypeObjetServices;

    @GetMapping
    public Collection<RefTypeObjetDto> getAll() {
        return this.refTypeObjetServices.findAll();
    }

    @PostMapping
    public void save(@RequestBody RefTypeObjetDto dto) {
        this.refTypeObjetServices.save(dto);
    }

}
