package aesahaettr.controller.personnes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.personnes.ILocalisationsServices;
import aesahaettr.ui.bean.personnes.LocalisationDto;

@RestController
@RequestMapping("api/personnes/{personneId}")
public class LocalisationsController {

    @Autowired
    private ILocalisationsServices localisationsServices;

    @PutMapping("/localisations/{localisationId}")
    public LocalisationDto update(@RequestBody LocalisationDto localisationDto) {
        return this.localisationsServices.update(localisationDto);
    }

    @PostMapping("/localisations")
    public LocalisationDto save(@RequestBody LocalisationDto localisationDto) {
        return this.localisationsServices.save(localisationDto);
    }

}
