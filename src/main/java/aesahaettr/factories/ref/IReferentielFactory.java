package aesahaettr.factories.ref;

import aesahaettr.ui.bean.ref.ReferentielItemDto;
import aesahaettr.xml.IReferentielItem;
import aesahaettr.xml.bean.Personne;

public interface IReferentielFactory {

    ReferentielItemDto map(IReferentielItem item);

    ReferentielItemDto map(Personne personne);

}
