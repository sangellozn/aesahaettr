package aesahaettr.controller.objets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.IEvenementsServices;
import aesahaettr.ui.bean.EvenementDto;

@RestController
@RequestMapping("api/objets/{objetId}/evenements")
public class EvenementsObjetsController {

    @Autowired
    private IEvenementsServices evenementsServices;

    @PutMapping("/{evenementId}")
    public EvenementDto update(@RequestBody EvenementDto evenementDto) {
        return this.evenementsServices.update(evenementDto);
    }

    @PostMapping
    public EvenementDto save(@RequestBody EvenementDto evenementDto) {
        return this.evenementsServices.saveForObjet(evenementDto);
    }

}
