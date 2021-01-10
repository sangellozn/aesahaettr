package aesahaettr.factories.ref;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.PaysDto;
import aesahaettr.xml.bean.Pays;

@Component
public class PaysFactory implements IPaysFactory {

    @Override
    public PaysDto map(Pays pays) {
        PaysDto paysDto = new PaysDto();

        paysDto.setCode(pays.getCode());
        paysDto.setId(pays.getId());
        paysDto.setNom(pays.getNom());

        return paysDto;
    }

}
