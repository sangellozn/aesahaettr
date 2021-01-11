package aesahaettr.controller.ref.type;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.type.IRefTypeAppartenanceServices;
import aesahaettr.ui.bean.ref.type.RefTypeAppartenanceDto;

@RestController
@RequestMapping("api/ref/type/appartenance")
public class RefTypeAppartenanceController {

    @Autowired
    private IRefTypeAppartenanceServices refTypeAppartenanceServices;

    @GetMapping
    public Collection<RefTypeAppartenanceDto> getAll() {
        return this.refTypeAppartenanceServices.findAll();
    }

    @PostMapping
    public void save(@RequestBody RefTypeAppartenanceDto dto) {
        this.refTypeAppartenanceServices.save(dto);
    }

}
