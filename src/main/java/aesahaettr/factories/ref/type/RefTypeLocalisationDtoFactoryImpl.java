package aesahaettr.factories.ref.type;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.type.RefTypeLocalisationDto;
import aesahaettr.xml.bean.TypeLocalisation;

@Component
public class RefTypeLocalisationDtoFactoryImpl implements IRefTypeLocalisationDtoFactory {

    @Override
    public RefTypeLocalisationDto mapToDto(TypeLocalisation bean) {
        RefTypeLocalisationDto resultat = new RefTypeLocalisationDto();

        resultat.setCode(bean.getCode());
        resultat.setLibelle(bean.getLibelle());

        return resultat;
    }

    @Override
    public TypeLocalisation mapToBean(RefTypeLocalisationDto dto) {
        TypeLocalisation resultat = new TypeLocalisation();

        resultat.setCode(dto.getCode());
        resultat.setLibelle(dto.getLibelle());

        return resultat;
    }

}
