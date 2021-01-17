package aesahaettr.services.ref;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.ref.IReferentielFactory;
import aesahaettr.ui.bean.ref.ReferentielItemDto;

@Service
public class ReferentielServicesImpl implements IReferentielServices {

    @Autowired
    private IReferentielFactory referentielFactory;

    @Override
    public Collection<ReferentielItemDto> findAllReferentielLocalisation() {
        return AesahaettrXmlInstance.getInstance().getRefTypeLocalisation().getTypeLocalisation().stream()
                .map(this.referentielFactory::map).collect(Collectors.toList());
    }

    @Override
    public Collection<ReferentielItemDto> findAllPays() {
        return AesahaettrXmlInstance.getInstance().getRefPays().getPays().stream()
                .map(this.referentielFactory::map).collect(Collectors.toList());
    }

}
