import { Evenement } from "../evenements/evenement";
import { Localisation } from "../localisations/localisation";
import { Objet } from "./objet";

export class ObjetFull {

    public static fromJson(json: any): ObjetFull {
        const objetFull: ObjetFull = new ObjetFull;

        objetFull.id = json['id'];
        objetFull.nom = json['nom'];
        objetFull.description = json['description'];
        objetFull.dateCreation = new Date(json['dateCreation']);

        if (json['dateModification']) {
            objetFull.dateModification = new Date(json['dateModification']);
        }

        objetFull.typeObjetCode = json['typeObjetCode'];
        objetFull.evenements = json['evenements'].map(Evenement.fromJson);
        objetFull.localisations = json['localisations'].map(Localisation.fromJson);

        return objetFull;
    }

    public toObjet(): Objet {
        const objet: Objet = new Objet;

        objet.id = this.id;
        objet.nom = this.nom;
        objet.description = this.description;
        objet.typeObjetCode = this.typeObjetCode;

        return objet;
    }

    id: string;
    nom: string;
    description: string;
    dateCreation: Date;
    dateModification: Date;
    typeObjetCode: string;
    evenements: Evenement[] = [];
    localisations: Localisation[] = [];

}
