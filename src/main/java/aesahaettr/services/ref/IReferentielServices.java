package aesahaettr.services.ref;

import java.util.Collection;

import aesahaettr.ui.bean.ref.ReferentielItemDto;

public interface IReferentielServices {

    Collection<ReferentielItemDto> findAllReferentielLocalisation();

    Collection<ReferentielItemDto> findAllPays();

    Collection<ReferentielItemDto> findAllTypeObjet();

    Collection<ReferentielItemDto> findAllTypeAppartenance();

    Collection<ReferentielItemDto> findAllPersonnes();

}
