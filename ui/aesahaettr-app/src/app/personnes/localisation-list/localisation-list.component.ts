import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Localisation } from 'src/app/bean/personnes/localisation';
import { ReferentielItem } from 'src/app/bean/referentiel-item';
import { ReferentielService } from 'src/app/services/ref/referentiel.service';

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

  refTypeLocalisations: ReferentielItem[] = [];

  refPays: ReferentielItem[] = [];

  /**
   * Localisation à ajouter ou à modifier.
   */
  localisation: Localisation = new Localisation;

  constructor(private referentielService: ReferentielService) { }

  ngOnInit() {
    this.referentielService.findAllLocalisation().subscribe(data => this.refTypeLocalisations = data);
    this.referentielService.findAllPays().subscribe(data => this.refPays = data);
  }

  onHidePopin(): void {
    this.reset();
  }

  editLocalisation(localisation: Localisation): void {
    this.localisation = {...localisation};
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
