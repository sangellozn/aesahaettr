export class Localisation {

    public static fromJson(json: object): Localisation {
        const resultat: Localisation = new Localisation;

        resultat.personneId = json['personneId'];
        resultat.adresseId = json['adresseId'];
        resultat.typeLocalisationCode = json['typeLocalisationCode'];
        resultat.typeLocalisationLibelle = json['typeLocalisationLibelle'];
        resultat.dateDebut = new Date(json['dateDebut']);
        if (json['dateFin']) {
            resultat.dateFin = new Date(json['dateFin']);
        }
        resultat.ligne1 = json['ligne1'];
        resultat.ligne2 = json['ligne2'];
        resultat.ligne3 = json['ligne3'];
        resultat.lieuDit = json['lieuDit'];
        resultat.codePostal = json['codePostal'];
        resultat.localiteDestination = json['localiteDestination'];
        resultat.paysCode = json['paysCode'];
        resultat.paysLibelle = json['paysLibelle'];

        return resultat;
    }

    personneId: string;
    adresseId: string;
    typeLocalisationCode: string;
    typeLocalisationLibelle: string;
    dateDebut: Date;
    dateFin: Date = null;
    ligne1: string;
    ligne2: string;
    ligne3: string;
    lieuDit: string;
    codePostal: string;
    localiteDestination: string;
    paysCode: string;
    paysLibelle: string;

}
