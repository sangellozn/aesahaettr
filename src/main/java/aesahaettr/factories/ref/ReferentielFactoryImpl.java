package aesahaettr.factories.ref;

import org.springframework.stereotype.Component;

import aesahaettr.ui.bean.ref.ReferentielItemDto;
import aesahaettr.xml.IReferentielItem;

@Component
public class ReferentielFactoryImpl implements IReferentielFactory {

    @Override
    public ReferentielItemDto map(IReferentielItem item) {
        ReferentielItemDto resultat = new ReferentielItemDto();

        resultat.setCode(item.getCode());
        resultat.setLibelle(item.getLibelle());

        return resultat;
    }

}
