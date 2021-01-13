import { Component, OnInit } from '@angular/core';
import { GenericRefType } from 'src/app/bean/ref/type/generic-ref-type';
import { RefTypeLocalisationService } from 'src/app/services/ref/type/ref-type-localisation.service';

@Component({
  selector: 'app-localisation',
  templateUrl: './localisation.component.html',
  styleUrls: ['./localisation.component.css']
})
export class LocalisationComponent implements OnInit {

  localisationList: GenericRefType[] = [];

  nouveauTypeLocalisation: GenericRefType = new GenericRefType;

  showAddNouveauTypeLocalisationPopin: boolean = false;

  modification: boolean = false;

  constructor(private refTypeLocalisationService: RefTypeLocalisationService) { }

  ngOnInit(): void {
    this.loadRefTypeLocalisation();
  }

  loadRefTypeLocalisation(): void {
    this.refTypeLocalisationService.findAll().subscribe(data => this.localisationList = data);
  }

  onNouveauTypeLocalisationBtnClick(): void {
    this.showAddNouveauTypeLocalisationPopin = true;
  }

  onNouveauTypeLocalisationPopinCancelBtnClick(): void {
    this.showAddNouveauTypeLocalisationPopin = false;
    this.nouveauTypeLocalisation = new GenericRefType;
    this.modification = false;
  }

  onLocalisationFormSubmit(): void {
    this.refTypeLocalisationService.save(this.nouveauTypeLocalisation)
      .subscribe(() => {
        this.showAddNouveauTypeLocalisationPopin = false;
        this.loadRefTypeLocalisation();
        this.nouveauTypeLocalisation = new GenericRefType;
        this.modification = false;
      });
  }

  editLocalisation(refTypeLocalisation: GenericRefType) {
    this.nouveauTypeLocalisation = {...refTypeLocalisation};
    this.modification = true;
    this.showAddNouveauTypeLocalisationPopin = true;
  }

  onHideNouveauTypeLocalisationPopin() {
    this.onNouveauTypeLocalisationPopinCancelBtnClick();
  }

}
