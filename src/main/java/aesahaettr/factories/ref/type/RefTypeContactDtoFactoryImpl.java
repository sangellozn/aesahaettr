package aesahaettr.factories.ref.type;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.type.RefTypeContactDto;
import aesahaettr.xml.bean.TypeContact;

@Component
public class RefTypeContactDtoFactoryImpl implements IRefTypeContactDtoFactory {

    @Override
    public RefTypeContactDto mapToDto(TypeContact bean) {
        RefTypeContactDto resultat = new RefTypeContactDto();

        resultat.setCode(bean.getCode());
        resultat.setLibelle(bean.getLibelle());

        return resultat;
    }

    @Override
    public TypeContact mapToBean(RefTypeContactDto dto) {
        TypeContact resultat = new TypeContact();

        resultat.setCode(dto.getCode());
        resultat.setLibelle(dto.getLibelle());

        return resultat;
    }

}
