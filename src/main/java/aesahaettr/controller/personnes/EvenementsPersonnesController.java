package aesahaettr.controller.personnes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.ui.bean.evenements.EvenementDto;

@RestController
@RequestMapping("api/personnes/{personneId}/evenements")
public class EvenementsPersonnesController {

    @PutMapping("/{evenementId}")
    public EvenementDto update(@RequestBody EvenementDto evenementDto) {
        return null; // TODO
    }

    @PostMapping
    public EvenementDto save(@RequestBody EvenementDto evenementDto) {
        return null; // TODO
    }

}
