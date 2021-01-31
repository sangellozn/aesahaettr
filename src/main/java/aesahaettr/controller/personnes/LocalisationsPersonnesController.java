package aesahaettr.controller.personnes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.ILocalisationsServices;
import aesahaettr.ui.bean.LocalisationDto;

@RestController
@RequestMapping("api/personnes/{personneId}/localisations")
public class LocalisationsPersonnesController {

    @Autowired
    private ILocalisationsServices localisationsServices;

    @PutMapping("/{localisationId}")
    public LocalisationDto update(@RequestBody LocalisationDto localisationDto) {
        return this.localisationsServices.updateForPersonne(localisationDto);
    }

    @PostMapping
    public LocalisationDto save(@RequestBody LocalisationDto localisationDto) {
        return this.localisationsServices.saveForPersonne(localisationDto);
    }

}
