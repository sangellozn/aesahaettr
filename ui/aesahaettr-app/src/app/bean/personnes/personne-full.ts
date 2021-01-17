import { Localisation } from "./localisation";

export class PersonneFull {

    public static fromJson(json: object): PersonneFull {
        const resultat: PersonneFull = new PersonneFull;

        resultat.id = json['id'];
        resultat.nom = json['nom'];
        resultat.prenoms = json['prenoms'];
        resultat.nomUsage = json['nomUsage'];
        resultat.prenomUsage = json['prenomUsage'];
        resultat.commentaire = json['commentaire'];
        resultat.dateCreation = new Date(json['dateCreation']);
        if (json['dateModification']) {
            resultat.dateModification = new Date(json['dateModification']);
        }
        resultat.localisations = json['localisations'].map(Localisation.fromJson);

        return resultat;
    }

    id: string;
    nom: string;
    prenoms: string;
    nomUsage: string;
    prenomUsage: string;
    commentaire: string;
    dateCreation: Date;
    dateModification: Date = null;
    localisations: Localisation[] = [];

}
