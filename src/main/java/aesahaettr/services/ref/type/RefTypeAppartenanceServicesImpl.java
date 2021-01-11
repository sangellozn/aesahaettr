package aesahaettr.services.ref.type;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.ref.type.IRefTypeAppartenanceDtoFactory;
import aesahaettr.ui.bean.ref.type.RefTypeAppartenanceDto;
import aesahaettr.xml.bean.TypeAppartenance;

@Service
public class RefTypeAppartenanceServicesImpl implements IRefTypeAppartenanceServices {

    @Autowired
    private IRefTypeAppartenanceDtoFactory refTypeAppartenanceDtoFactory;

    @Override
    public Collection<RefTypeAppartenanceDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getRefTypeAppartenance().getTypeAppartenance()
                .stream().map(this.refTypeAppartenanceDtoFactory::mapToDto).collect(Collectors.toList());
    }

    private Optional<TypeAppartenance> getByCodeIntern(String code) {
        return AesahaettrXmlInstance.getInstance().getRefTypeAppartenance().getTypeAppartenance()
                .stream().filter(item -> item.getCode().equals(code))
                .findFirst();
    }

    @Override
    public void save(RefTypeAppartenanceDto dto) {
        Optional<TypeAppartenance> typeAppartenanceOpt = this.getByCodeIntern(dto.getCode());

        if (typeAppartenanceOpt.isPresent()) {
            typeAppartenanceOpt.get().setLibelle(dto.getLibelle());
        } else {
            AesahaettrXmlInstance.getInstance().getRefTypeAppartenance().getTypeAppartenance()
                    .add(this.refTypeAppartenanceDtoFactory.mapToBean(dto));
        }

        AesahaettrXmlInstance.save();

    }

}
