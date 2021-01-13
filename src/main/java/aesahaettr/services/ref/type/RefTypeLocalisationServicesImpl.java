package aesahaettr.services.ref.type;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.ref.type.IRefTypeLocalisationDtoFactory;
import aesahaettr.ui.bean.ref.type.RefTypeLocalisationDto;
import aesahaettr.xml.bean.TypeLocalisation;

@Service
public class RefTypeLocalisationServicesImpl implements IRefTypeLocalisationServices {

    @Autowired
    private IRefTypeLocalisationDtoFactory refTypeLocalisationDtoFactory;

    @Override
    public Collection<RefTypeLocalisationDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getRefTypeLocalisation().getTypeLocalisation()
                .stream().map(this.refTypeLocalisationDtoFactory::mapToDto).collect(Collectors.toList());
    }

    private Optional<TypeLocalisation> getByCodeIntern(String code) {
        return AesahaettrXmlInstance.getInstance().getRefTypeLocalisation().getTypeLocalisation()
                .stream().filter(item -> item.getCode().equals(code))
                .findFirst();
    }

    @Override
    public void save(RefTypeLocalisationDto dto) {
        Optional<TypeLocalisation> typeLocalisationOpt = this.getByCodeIntern(dto.getCode());

        if (typeLocalisationOpt.isPresent()) {
            typeLocalisationOpt.get().setLibelle(dto.getLibelle());
        } else {
            AesahaettrXmlInstance.getInstance().getRefTypeLocalisation().getTypeLocalisation()
                    .add(this.refTypeLocalisationDtoFactory.mapToBean(dto));
        }

        AesahaettrXmlInstance.save();
    }

}
