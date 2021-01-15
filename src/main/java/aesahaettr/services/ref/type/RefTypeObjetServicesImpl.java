package aesahaettr.services.ref.type;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.ref.type.IRefTypeObjetDtoFactory;
import aesahaettr.ui.bean.ref.type.RefTypeObjetDto;
import aesahaettr.xml.bean.TypeObjet;

@Service
public class RefTypeObjetServicesImpl implements IRefTypeObjetServices {

    @Autowired
    private IRefTypeObjetDtoFactory refTypeObjetDtoFactory;

    @Override
    public Collection<RefTypeObjetDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getRefTypeObjet().getTypeObjet()
                .stream().map(this.refTypeObjetDtoFactory::mapToDto).collect(Collectors.toList());
    }

    private Optional<TypeObjet> getByCodeIntern(String code) {
        return AesahaettrXmlInstance.getInstance().getRefTypeObjet().getTypeObjet()
                .stream().filter(item -> item.getCode().equals(code))
                .findFirst();
    }

    @Override
    public void save(RefTypeObjetDto dto) {
        Optional<TypeObjet> typeObjetOpt = this.getByCodeIntern(dto.getCode());

        if (typeObjetOpt.isPresent()) {
            typeObjetOpt.get().setLibelle(dto.getLibelle());
        } else {
            AesahaettrXmlInstance.getInstance().getRefTypeObjet().getTypeObjet()
                    .add(this.refTypeObjetDtoFactory.mapToBean(dto));
        }

        AesahaettrXmlInstance.save();
    }

}
