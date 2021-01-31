package aesahaettr.services.personnes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.factories.personnes.ILocalisationsFactory;
import aesahaettr.finder.ObjectFinder;
import aesahaettr.ui.bean.personnes.LocalisationDto;
import aesahaettr.xml.bean.Adresse;
import aesahaettr.xml.bean.Aesahaettr;
import aesahaettr.xml.bean.Localisation;
import aesahaettr.xml.bean.Personne;

@Service
public class LocalisationsServicesImpl implements ILocalisationsServices {

    @Autowired
    private ILocalisationsFactory localisationFactory;

    @Override
    public LocalisationDto save(LocalisationDto dto) {

        String personneId = dto.getPersonneId();

        Adresse adresse = this.localisationFactory.mapDtoToNewAdresseBean(dto);
        Localisation localisation = this.localisationFactory.mapDtoToNewLocalisationBean(dto, adresse);

        Aesahaettr instance = AesahaettrXmlInstance.getInstance();
        instance.getAdresses().getAdresse().add(adresse);

        Personne personne = ObjectFinder.getPersonneById(personneId);
        personne.getLocalisations().getLocalisation().add(localisation);

        AesahaettrXmlInstance.save();

        return this.localisationFactory.mapToDto(localisation, personne);
    }

    @Override
    public LocalisationDto update(LocalisationDto dto) {
        Adresse adresse = ObjectFinder.getAdresseById(dto.getAdresseId());
        Personne personne = ObjectFinder.getPersonneById(dto.getPersonneId());

        Localisation localisation = ObjectFinder.getLocalisationById(dto.getId(), personne);

        this.localisationFactory.updateBean(adresse, dto);
        this.localisationFactory.updateBean(localisation, dto);

        AesahaettrXmlInstance.save();

        return this.localisationFactory.mapToDto(localisation, personne);
    }

}
