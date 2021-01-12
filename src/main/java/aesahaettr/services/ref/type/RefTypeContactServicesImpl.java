package aesahaettr.services.ref.type;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.ref.type.IRefTypeContactDtoFactory;
import aesahaettr.ui.bean.ref.type.RefTypeContactDto;
import aesahaettr.xml.bean.TypeContact;

@Service
public class RefTypeContactServicesImpl implements IRefTypeContactServices {

    @Autowired
    private IRefTypeContactDtoFactory refTypeContactDtoFactory;

    @Override
    public Collection<RefTypeContactDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getRefTypeContact().getTypeContact()
                .stream().map(this.refTypeContactDtoFactory::mapToDto).collect(Collectors.toList());
    }

    private Optional<TypeContact> getByCodeIntern(String code) {
        return AesahaettrXmlInstance.getInstance().getRefTypeContact().getTypeContact()
                .stream().filter(item -> item.getCode().equals(code))
                .findFirst();
    }

    @Override
    public void save(RefTypeContactDto dto) {
        Optional<TypeContact> typeContactOpt = this.getByCodeIntern(dto.getCode());

        if (typeContactOpt.isPresent()) {
            typeContactOpt.get().setLibelle(dto.getLibelle());
        } else {
            AesahaettrXmlInstance.getInstance().getRefTypeContact().getTypeContact()
                    .add(this.refTypeContactDtoFactory.mapToBean(dto));
        }

        AesahaettrXmlInstance.save();
    }

}
