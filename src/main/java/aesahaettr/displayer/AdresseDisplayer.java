package aesahaettr.displayer;

import java.util.Objects;

import aesahaettr.xml.bean.Adresse;

public final class AdresseDisplayer {

    private AdresseDisplayer() {
        throw new IllegalArgumentException("Classe utilitaire.");
    }

    public static String getAdresseDisplay(Adresse adresse) {
        Objects.requireNonNull(adresse);

        return new StringBuilder().append(adresse.getLigne1())
                .append(' ')
                .append(adresse.getCodePostal())
                .append(' ')
                .append(adresse.getLocaliteDestination())
                .append(' ')
                .append(adresse.getPaysCode())
                .toString();
    }

}
