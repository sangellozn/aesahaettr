export class Localisation {

    constructor(elementId?: string) {
        this.elementId = elementId;
        this.paysCode = 'FR';
        this.typeLocalisationCode = 'SITUE';
    }

    public static fromJson(json: object): Localisation {
        const resultat: Localisation = new Localisation;

        resultat.id = json['id'];
        resultat.elementId = json['elementId'];
        resultat.adresseId = json['adresseId'];
        resultat.typeLocalisationCode = json['typeLocalisationCode'];
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

        return resultat;
    }

    id: string;
    elementId: string;
    adresseId: string;
    typeLocalisationCode: string;
    dateDebut: Date;
    dateFin: Date = null;
    ligne1: string;
    ligne2: string;
    ligne3: string;
    lieuDit: string;
    codePostal: string;
    localiteDestination: string;
    paysCode: string;

}
