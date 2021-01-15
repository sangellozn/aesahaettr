package aesahaettr.factories.ref.type;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.type.RefTypeRelationDto;
import aesahaettr.xml.bean.TypeRelation;

@Component
public class RefTypeRelationDtoFactoryImpl implements IRefTypeRelationDtoFactory {

    @Override
    public RefTypeRelationDto mapToDto(TypeRelation bean) {
        RefTypeRelationDto resultat = new RefTypeRelationDto();

        resultat.setCode(bean.getCode());
        resultat.setLibelle(bean.getLibelle());

        return resultat;
    }

    @Override
    public TypeRelation mapToBean(RefTypeRelationDto dto) {
        TypeRelation resultat = new TypeRelation();

        resultat.setCode(dto.getCode());
        resultat.setLibelle(dto.getLibelle());

        return resultat;
    }

}
