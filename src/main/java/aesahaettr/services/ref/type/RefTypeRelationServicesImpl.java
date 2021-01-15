package aesahaettr.services.ref.type;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.ref.type.IRefTypeRelationDtoFactory;
import aesahaettr.ui.bean.ref.type.RefTypeRelationDto;
import aesahaettr.xml.bean.TypeRelation;

@Service
public class RefTypeRelationServicesImpl implements IRefTypeRelationServices {

    @Autowired
    private IRefTypeRelationDtoFactory refTypeRelationDtoFactory;

    @Override
    public Collection<RefTypeRelationDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getRefTypeRelation().getTypeRelation()
                .stream().map(this.refTypeRelationDtoFactory::mapToDto).collect(Collectors.toList());
    }

    private Optional<TypeRelation> getByCodeIntern(String code) {
        return AesahaettrXmlInstance.getInstance().getRefTypeRelation().getTypeRelation()
                .stream().filter(item -> item.getCode().equals(code))
                .findFirst();
    }

    @Override
    public void save(RefTypeRelationDto dto) {
        Optional<TypeRelation> typeRelationOpt = this.getByCodeIntern(dto.getCode());

        if (typeRelationOpt.isPresent()) {
            typeRelationOpt.get().setLibelle(dto.getLibelle());
        } else {
            AesahaettrXmlInstance.getInstance().getRefTypeRelation().getTypeRelation()
                    .add(this.refTypeRelationDtoFactory.mapToBean(dto));
        }

        AesahaettrXmlInstance.save();
    }

}
