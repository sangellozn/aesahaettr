package aesahaettr.services.ref;

import java.util.Collection;
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
                .stream().map(this.paysFactory::map).collect(Collectors.toList());
    }

    @Override
    public PaysDto getById(String id) {
        return this.paysFactory.map(this.getByIdIntern(id));
    }

    @Override
    public void save(PaysDto paysDto) {
        // TODO Auto-generated method stub

    }

    private Pays getByIdIntern(String id) {
        return AesahaettrXmlInstance.getInstance().getRefPays().getPays()
                .stream().filter(item -> item.getId().equals(id))
                .findFirst().orElseThrow(() -> new PaysNotFoundException(id));
    }

}
