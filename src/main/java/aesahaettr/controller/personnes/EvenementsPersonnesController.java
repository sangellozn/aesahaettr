package aesahaettr.controller.personnes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.IEvenementsServices;
import aesahaettr.ui.bean.EvenementDto;

@RestController
@RequestMapping("api/personnes/{personneId}/evenements")
public class EvenementsPersonnesController {

    @Autowired
    private IEvenementsServices evenementsServices;

    @PutMapping("/{evenementId}")
    public EvenementDto update(@RequestBody EvenementDto evenementDto) {
        return this.evenementsServices.updateForPersonne(evenementDto);
    }

    @PostMapping
    public EvenementDto save(@RequestBody EvenementDto evenementDto) {
        return this.evenementsServices.saveForPersonne(evenementDto);
    }

}
