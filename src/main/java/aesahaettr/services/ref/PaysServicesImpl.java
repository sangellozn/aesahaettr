package aesahaettr.services.ref;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.exceptions.ref.PaysNotFoundException;
import aesahaettr.factories.ref.IPaysFactory;
import aesahaettr.ui.bean.ref.PaysDto;
import aesahaettr.xml.bean.Pays;

@Service
public class PaysServicesImpl implements IPaysServices {

    @Autowired
    private IPaysFactory paysFactory;

    @Override
    public Collection<PaysDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getRefPays().getPays()
                .stream().map(this.paysFactory::mapToDto).sorted().collect(Collectors.toList());
    }

    @Override
    public PaysDto getByCode(String code) {
        return this.paysFactory.mapToDto(this.getByCodeIntern(code).orElseThrow(() -> new PaysNotFoundException(code)));
    }

    @Override
    public void save(PaysDto paysDto) {
        Optional<Pays> paysOpt = this.getByCodeIntern(paysDto.getCode());

        if (paysOpt.isPresent()) {
            paysOpt.get().setNom(paysDto.getNom());
        } else {
            AesahaettrXmlInstance.getInstance().getRefPays().getPays().add(this.paysFactory.mapToBean(paysDto));
        }

        AesahaettrXmlInstance.save();
    }

    private Optional<Pays> getByCodeIntern(String code) {
        return AesahaettrXmlInstance.getInstance().getRefPays().getPays()
                .stream().filter(item -> item.getCode().equals(code))
                .findFirst();
    }

}
