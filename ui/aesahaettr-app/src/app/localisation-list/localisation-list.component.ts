import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Localisation } from 'src/app/bean/localisations/localisation';
import { ReferentielItem } from 'src/app/bean/referentiel-item';
import { LocalisationsService } from 'src/app/services/localisations.service';
import { ReferentielService } from 'src/app/services/ref/referentiel.service';

@Component({
  selector: 'app-localisation-list',
  templateUrl: './localisation-list.component.html',
  styleUrls: ['./localisation-list.component.css']
})
export class LocalisationListComponent implements OnInit {

  @Input() elementId: string;

  /**
   * Liste des éléments à afficher.
   */
  @Input() localisations: Localisation[] = [];

  @Input() visible: boolean = false;

  @Output() onEditAddActionCompleted = new EventEmitter<boolean>();

  @Input() type: string = 'PERSONNE';

  modification: boolean = false;

  refTypeLocalisations: ReferentielItem[] = [];

  refPays: ReferentielItem[] = [];

  /**
   * Localisation à ajouter ou à modifier.
   */
  localisation: Localisation = new Localisation;

  constructor(private referentielService: ReferentielService, private localisationsService: LocalisationsService) { }

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
    if (this.localisation.id) {
      if (this.type === 'PERSONNE') {
        this.localisationsService.updateForPersonne(this.localisation).subscribe(() => this.reset(true));
      } else if (this.type === 'OBJET') {
        this.localisationsService.updateForObjet(this.localisation).subscribe(() => this.reset(true));
      }
    } else {
      this.localisation.elementId = this.elementId;
      if (this.type === 'PERSONNE') {
        this.localisationsService.saveForPersonne(this.localisation).subscribe(() => this.reset(true));
      } else if (this.type === 'OBJET') {
        this.localisationsService.saveForObjet(this.localisation).subscribe(() => this.reset(true));
      }
    }
  }

  onPopinCancelBtnClick(): void {
    this.reset();
  }

  reset(reload = false): void {
    this.visible = false;
    this.modification = false;
    this.localisation = new Localisation;
    this.onEditAddActionCompleted.emit(reload);
  }

  getPaysByCode(code: string): ReferentielItem {
    return this.refPays.filter(item => item.code === code)[0] || new ReferentielItem;
  }

  getTypeLocalisationByCode(code: string): ReferentielItem {
    return this.refTypeLocalisations.filter(item => item.code === code)[0] || new ReferentielItem;
  }

}
