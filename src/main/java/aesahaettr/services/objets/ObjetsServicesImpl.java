package aesahaettr.services.objets;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.objets.IObjetsFactory;
import aesahaettr.finder.ObjectFinder;
import aesahaettr.ui.bean.objets.ObjetFullDto;
import aesahaettr.ui.bean.objets.ObjetListItemDto;
import aesahaettr.ui.bean.objets.ObjetMinimalDto;
import aesahaettr.xml.bean.Objet;
import aesahaettr.xml.bean.Personne;
import aesahaettr.xml.bean.Possession;

@Service
public class ObjetsServicesImpl implements IObjetsServices {

    @Autowired
    private IObjetsFactory objetsFactory;

    @Override
    public Collection<ObjetListItemDto> findAll() {
        return AesahaettrXmlInstance.getInstance().getObjets().getObjet().stream()
                .map(this.objetsFactory::mapToListItemDto)
                .collect(Collectors.toList());
    }

    @Override
    public ObjetFullDto save(ObjetMinimalDto dto) {
        Objet objet = this.objetsFactory.mapToNewBean(dto);

        String personneId = dto.getPersonneId();
        if (personneId != null) {
            Possession possession = this.objetsFactory.mapToNewPossessionBean(dto, objet.getId());
            Personne personne = ObjectFinder.getPersonneById(personneId);
            personne.getPossessions().getPossession().add(possession);
        }

        AesahaettrXmlInstance.getInstance().getObjets().getObjet().add(objet);

        AesahaettrXmlInstance.save();

        return this.objetsFactory.mapToFullDto(objet);
    }

    @Override
    public ObjetFullDto update(ObjetMinimalDto dto) {
        // TODO Auto-generated method stub
        return null;
    }

}
