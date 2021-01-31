import { Evenement } from "../evenements/evenement";
import { Localisation } from "../localisations/localisation";
import { Personne } from "./personne";

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
        resultat.evenements = json['evenements'].map(Evenement.fromJson);

        return resultat;
    }

    public toPersonne(): Personne {
        const personne = new Personne;

        personne.id = this.id;
        personne.nom = this.nom;
        personne.nomUsage = this.nomUsage;
        personne.prenomUsage = this.prenomUsage;
        personne.prenoms = this.prenoms;
        personne.commentaire = this.commentaire;

        return personne;
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
    evenements: Evenement[] = [];

}
