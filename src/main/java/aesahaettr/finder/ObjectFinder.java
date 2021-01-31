package aesahaettr.finder;

import java.util.Objects;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.exceptions.AdresseNotFoundException;
import aesahaettr.exceptions.personnes.LocalisationNotFoundException;
import aesahaettr.exceptions.personnes.PersonneNotFoundException;
import aesahaettr.exceptions.ref.PaysNotFoundException;
import aesahaettr.exceptions.ref.RefTypeNotFoundException;
import aesahaettr.xml.bean.Adresse;
import aesahaettr.xml.bean.Localisation;
import aesahaettr.xml.bean.Pays;
import aesahaettr.xml.bean.Personne;
import aesahaettr.xml.bean.TypeLocalisation;

public final class ObjectFinder {

    private ObjectFinder() {
        throw new IllegalArgumentException("Classe utilitaire.");
    }

    public static Adresse getAdresseById(String id) {
        Objects.requireNonNull(id);
        return AesahaettrXmlInstance.getInstance().getAdresses().getAdresse().stream()
                .filter(item -> item.getId().equals(id)).findFirst()
                .orElseThrow(() -> new AdresseNotFoundException(id));
    }

    public static Personne getPersonneById(String id) {
        Objects.requireNonNull(id);
        return AesahaettrXmlInstance.getInstance().getPersonnes().getPersonne().stream()
                .filter(item -> item.getId().equals(id)).findFirst()
                .orElseThrow(() -> new PersonneNotFoundException(id));
    }

    public static Pays getPaysByCode(String code) {
        Objects.requireNonNull(code);
        return AesahaettrXmlInstance.getInstance().getRefPays().getPays().stream()
                .filter(item -> item.getCode().equals(code)).findFirst()
                .orElseThrow(() -> new PaysNotFoundException(code));
    }

    public static TypeLocalisation getTypeLocalisationByCode(String code) {
        Objects.requireNonNull(code);
        return AesahaettrXmlInstance.getInstance().getRefTypeLocalisation().getTypeLocalisation().stream()
                .filter(item -> item.getCode().equals(code)).findFirst()
                .orElseThrow(() -> new RefTypeNotFoundException(code));
    }

    public static Localisation getLocalisationById(String id, Personne personne) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(personne);
        return personne.getLocalisations().getLocalisation().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElseThrow(() -> new LocalisationNotFoundException(id, personne.getId()));
    }

}
