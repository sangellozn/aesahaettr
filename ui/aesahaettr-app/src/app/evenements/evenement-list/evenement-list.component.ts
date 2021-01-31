import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Evenement } from 'src/app/bean/evenements/evenement';
import { EvenementsService } from 'src/app/services/evenements.service';

@Component({
  selector: 'app-evenement-list',
  templateUrl: './evenement-list.component.html',
  styleUrls: ['./evenement-list.component.css']
})
export class EvenementListComponent implements OnInit {

  /**
   * Objet ou personne id.
   */
  @Input() elementId: string;

  @Input() visible: boolean = false;

  @Input() evenements: Evenement[] = [];

  @Input() type: string = 'PERSONNE';

  modification: boolean = false;

  evenement: Evenement = new Evenement;

  @Output() onEditAddActionCompleted = new EventEmitter<boolean>();

  constructor(private evenementsService: EvenementsService) { }

  ngOnInit(): void {

  }

  editEvenement(evenement: Evenement): void {
    this.evenement = {...evenement};
    this.visible = true;
    this.modification = true;
  }

  onEvenementFormSubmit(): void {
    if (this.evenement.id) {
      if (this.type === 'PERSONNE') {
        this.evenementsService.updateForPersonne(this.evenement).subscribe(() => this.reset(true));
      } else {
        // TODO
      }
    } else {
      this.evenement.elementId = this.elementId;
      if (this.type === 'PERSONNE') {
        this.evenementsService.saveForPersonne(this.evenement).subscribe(() => this.reset(true));
      } else {
        // TODO
      }
    }
  }

  onHidePopin(): void {
    this.reset();
  }

  onPopinCancelBtnClick(): void {
    this.reset();
  }

  reset(reload = false): void {
    this.visible = false;
    this.modification = false;
    this.evenement = new Evenement;
    this.onEditAddActionCompleted.emit(reload);
  }

}
