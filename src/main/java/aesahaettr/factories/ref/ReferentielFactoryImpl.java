package aesahaettr.factories.ref;

import org.springframework.stereotype.Component;

import aesahaettr.displayer.ObjectDisplayer;
import aesahaettr.ui.bean.ref.ReferentielItemDto;
import aesahaettr.xml.IReferentielItem;
import aesahaettr.xml.bean.Personne;

@Component
public class ReferentielFactoryImpl implements IReferentielFactory {

    @Override
    public ReferentielItemDto map(IReferentielItem item) {
        ReferentielItemDto resultat = new ReferentielItemDto();

        resultat.setCode(item.getCode());
        resultat.setLibelle(item.getLibelle());

        return resultat;
    }

    @Override
    public ReferentielItemDto map(Personne personne) {
        ReferentielItemDto resultat = new ReferentielItemDto();

        resultat.setCode(personne.getId());
        resultat.setLibelle(ObjectDisplayer.getPersonneDisplay(personne));

        return resultat;
    }

}
