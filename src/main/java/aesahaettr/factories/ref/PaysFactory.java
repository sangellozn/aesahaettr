package aesahaettr.factories.ref;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.PaysDto;
import aesahaettr.xml.bean.Pays;

@Component
public class PaysFactory implements IPaysFactory {

    @Override
    public PaysDto mapToDto(Pays pays) {
        PaysDto paysDto = new PaysDto();

        paysDto.setCode(pays.getCode());
        paysDto.setNom(pays.getNom());

        return paysDto;
    }

    @Override
    public Pays mapToBean(PaysDto bean) {
        Pays pays = new Pays();

        pays.setCode(bean.getCode());
        pays.setNom(bean.getNom());

        return pays;
    }

}
