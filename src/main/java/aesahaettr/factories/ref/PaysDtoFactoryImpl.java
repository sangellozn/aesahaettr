package aesahaettr.factories.ref;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.PaysDto;
import aesahaettr.xml.bean.Pays;

@Component
public class PaysDtoFactoryImpl implements IPaysDtoFactory {

    @Override
    public PaysDto mapToDto(Pays bean) {
        PaysDto paysDto = new PaysDto();

        paysDto.setCode(bean.getCode());
        paysDto.setNom(bean.getNom());

        return paysDto;
    }

    @Override
    public Pays mapToBean(PaysDto dto) {
        Pays pays = new Pays();

        pays.setCode(dto.getCode());
        pays.setNom(dto.getNom());

        return pays;
    }

}
