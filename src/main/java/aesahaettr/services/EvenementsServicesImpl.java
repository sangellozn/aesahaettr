package aesahaettr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.IEvenementsFactory;
import aesahaettr.finder.ObjectFinder;
import aesahaettr.ui.bean.EvenementDto;
import aesahaettr.xml.bean.Evenement;
import aesahaettr.xml.bean.Personne;

@Service
public class EvenementsServicesImpl implements IEvenementsServices {

    @Autowired
    private IEvenementsFactory evenementsFactory;

    @Override
    public EvenementDto saveForPersonne(EvenementDto dto) {
        Evenement evenement = this.evenementsFactory.mapDtoToNewBean(dto);
        Personne personne = ObjectFinder.getPersonneById(dto.getElementId());

        personne.getEvenementIds().getEvenementId().add(evenement.getId());
        AesahaettrXmlInstance.getInstance().getEvenements().getEvenement().add(evenement);

        AesahaettrXmlInstance.save();

        return this.evenementsFactory.mapToDto(evenement, personne);
    }

    @Override
    public EvenementDto updateForPersonne(EvenementDto dto) {
        Evenement evenement = ObjectFinder.getEvenementById(dto.getId());
        this.evenementsFactory.updateBean(evenement, dto);

        AesahaettrXmlInstance.save();

        return this.evenementsFactory.mapToDto(evenement, ObjectFinder.getPersonneById(dto.getElementId()));
    }

}
