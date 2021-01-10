package aesahaettr.services;

import org.springframework.stereotype.Service;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.ui.bean.GreetingsDto;

@Service
public class GreetingsServicesImpl implements IGreetingsServices {

    @Override
    public GreetingsDto getGreetings() {
        GreetingsDto resultat = new GreetingsDto();

        resultat.setNom("Sébastien");
        resultat.setObjetsCount(AesahaettrXmlInstance.getInstance().getObjets().getObjet().size());
        resultat.setPersonnesCount(AesahaettrXmlInstance.getInstance().getPersonnes().getPersonne().size());

        return resultat;
    }

}
