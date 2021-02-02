package aesahaettr.displayer;

import java.util.Objects;

import aesahaettr.xml.bean.Adresse;
import aesahaettr.xml.bean.Personne;

public final class ObjectDisplayer {

    private ObjectDisplayer() {
        throw new IllegalArgumentException("Classe utilitaire.");
    }

    public static String getAdresseDisplay(Adresse adresse) {
        Objects.requireNonNull(adresse);

        return new StringBuilder().append(adresse.getLigne1())
                .append(", ")
                .append(adresse.getCodePostal())
                .append(' ')
                .append(adresse.getLocaliteDestination())
                .append(" (")
                .append(adresse.getPaysCode())
                .append(')')
                .toString();
    }

    public static String getPersonneDisplay(Personne personne) {
        Objects.requireNonNull(personne);

        return new StringBuilder().append(personne.getNomUsage())
                .append(' ')
                .append(personne.getPrenomUsage())
                .toString();
    }


}
