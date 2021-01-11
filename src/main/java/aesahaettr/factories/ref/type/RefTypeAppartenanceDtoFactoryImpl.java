package aesahaettr.factories.ref.type;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.type.RefTypeAppartenanceDto;
import aesahaettr.xml.bean.TypeAppartenance;

@Component
public class RefTypeAppartenanceDtoFactoryImpl implements IRefTypeAppartenanceDtoFactory {

    @Override
    public RefTypeAppartenanceDto mapToDto(TypeAppartenance bean) {
        RefTypeAppartenanceDto resultat = new RefTypeAppartenanceDto();

        resultat.setCode(bean.getCode());
        resultat.setLibelle(bean.getLibelle());

        return resultat;
    }

    @Override
    public TypeAppartenance mapToBean(RefTypeAppartenanceDto dto) {
        TypeAppartenance resultat = new TypeAppartenance();

        resultat.setCode(dto.getCode());
        resultat.setLibelle(dto.getLibelle());

        return resultat;
    }

}
