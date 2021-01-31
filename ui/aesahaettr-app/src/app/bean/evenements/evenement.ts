export class Evenement {

    public static fromJson(json: object): Evenement {
        const evenement: Evenement = new Evenement;

        evenement.id = json['id'];
        evenement.elementId = json['elementId'];

        if (json['dateDebut']) {
            evenement.dateDebut = new Date(json['dateDebut']);
        }

        if (json['dateFin']) {
            evenement.dateFin = new Date(json['dateFin']);
        }

        if (json['dateEvenement']) {
            evenement.dateEvenement = new Date(json['dateEvenement']);
        }

        evenement.resume = json['resume'];
        evenement.description = json['description'];

        return evenement;
    }

    id: string;
    elementId: string;
    dateDebut: Date = null;
    dateFin: Date = null;
    dateEvenement: Date = null;
    resume: string;
    description: string;

}
