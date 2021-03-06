package aesahaettr.finder;

import java.util.Objects;
import java.util.Optional;

import aesahaettr.AesahaettrXmlInstance;
import aesahaettr.exceptions.AdresseNotFoundException;
import aesahaettr.exceptions.EvenementNotFoundException;
import aesahaettr.exceptions.LocalisationNotFoundException;
import aesahaettr.exceptions.objets.ObjetNotFoundException;
import aesahaettr.exceptions.personnes.PersonneNotFoundException;
import aesahaettr.exceptions.ref.PaysNotFoundException;
import aesahaettr.exceptions.ref.RefTypeNotFoundException;
import aesahaettr.xml.bean.Adresse;
import aesahaettr.xml.bean.Evenement;
import aesahaettr.xml.bean.Localisation;
import aesahaettr.xml.bean.Objet;
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

    public static Localisation getLocalisationById(String id, Objet objet) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(objet);
        return objet.getLocalisations().getLocalisation().stream().filter(item -> item.getId().equals(id))
                .findFirst().orElseThrow(() -> new LocalisationNotFoundException(id, objet.getId()));
    }

    public static Evenement getEvenementById(String id) {
        Objects.requireNonNull(id);
        return AesahaettrXmlInstance.getInstance().getEvenements().getEvenement().stream()
                .filter(item -> item.getId().equals(id))
                .findFirst().orElseThrow(() -> new EvenementNotFoundException(id));
    }

    public static Optional<Personne> getPersonnePossesseurByObjetId(String objetId) {
        Objects.requireNonNull(objetId);
        return AesahaettrXmlInstance.getInstance().getPersonnes().getPersonne().stream()
                .filter(item -> item.getPossessions().getPossession().stream().anyMatch(poss -> poss.getObjetId().equals(objetId)))
                .findFirst();
    }

    public static Objet getObjetById(String id) {
        Objects.requireNonNull(id);
        return AesahaettrXmlInstance.getInstance().getObjets().getObjet().stream()
                .filter(item -> item.getId().equals(id))
                .findFirst().orElseThrow(() -> new ObjetNotFoundException(id));
    }

}
