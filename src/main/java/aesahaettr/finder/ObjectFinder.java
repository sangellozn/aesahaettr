package aesahaettr.finder;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.exceptions.AdresseNotFoundException;
import aesahaettr.xml.bean.Adresse;

public final class ObjectFinder {

    private ObjectFinder() {
        throw new IllegalArgumentException("Classe utilitaire.");
    }

    public static Adresse getAdresseById(String id) {
        return AesahaettrXmlInstance.getInstance().getAdresses().getAdresse().stream()
                .filter(item -> item.getId().equals(id)).findFirst()
                .orElseThrow(() -> new AdresseNotFoundException(id));
    }

}
