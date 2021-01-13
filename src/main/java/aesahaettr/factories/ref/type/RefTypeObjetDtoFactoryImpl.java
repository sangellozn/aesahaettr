package aesahaettr.factories.ref.type;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.type.RefTypeObjetDto;
import aesahaettr.xml.bean.TypeObjet;

@Component
public class RefTypeObjetDtoFactoryImpl implements IRefTypeObjetDtoFactory {

    @Override
    public RefTypeObjetDto mapToDto(TypeObjet bean) {
        RefTypeObjetDto resultat = new RefTypeObjetDto();

        resultat.setCode(bean.getCode());
        resultat.setLibelle(bean.getLibelle());

        return resultat;
    }

    @Override
    public TypeObjet mapToBean(RefTypeObjetDto dto) {
        TypeObjet resultat = new TypeObjet();

        resultat.setCode(dto.getCode());
        resultat.setLibelle(dto.getLibelle());

        return resultat;
    }

}
