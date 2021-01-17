package aesahaettr.factories.ref;

import aesahaettr.ui.bean.ref.ReferentielItemDto;
import aesahaettr.xml.IReferentielItem;

public interface IReferentielFactory {

    ReferentielItemDto map(IReferentielItem item);

}
