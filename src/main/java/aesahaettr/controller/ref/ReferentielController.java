package aesahaettr.controller.ref;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ref.IReferentielServices;
import aesahaettr.ui.bean.ref.ReferentielItemDto;

@RestController
@RequestMapping("api/referentiels")
public class ReferentielController {

    @Autowired
    private IReferentielServices referentielServices;

    @GetMapping("localisations")
    public Collection<ReferentielItemDto> getAllLocalisation() {
        return this.referentielServices.findAllReferentielLocalisation();
    }

    @GetMapping("pays")
    public Collection<ReferentielItemDto> getAllPays() {
        return this.referentielServices.findAllPays();
    }

}
