import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Localisation } from 'src/app/bean/personnes/localisation';

@Component({
  selector: 'app-localisation-list',
  templateUrl: './localisation-list.component.html',
  styleUrls: ['./localisation-list.component.css']
})
export class LocalisationListComponent implements OnInit {

  @Input() personneId: string;

  /**
   * Liste des éléments à afficher.
   */
  @Input() localisations: Localisation[] = [];

  @Input() visible: boolean = false;

  @Output() onEditAddActionCompleted = new EventEmitter<boolean>();

  modification: boolean = false;

  /**
   * Localisation à ajouter ou à modifier.
   */
  localisation: Localisation = new Localisation;

  constructor() { }

  ngOnInit() {
    
  }

  onHidePopin(): void {
    this.reset();
  }

  editLocalisation(localisation: Localisation): void {
    console.log(localisation);
    this.localisation = localisation;
    this.visible = true;
    this.modification = true;
  }

  onLocalisationFormSubmit(): void {
    // TODO save
    this.reset();
  }

  onPopinCancelBtnClick(): void {
    this.reset();
  }

  reset(): void {
    this.visible = false;
    this.modification = false;
    this.localisation = new Localisation;
    this.onEditAddActionCompleted.emit(true);
  }

}
