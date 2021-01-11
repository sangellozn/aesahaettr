import { Component, OnInit } from '@angular/core';
import { GenericRefType } from 'src/app/bean/ref/type/generic-ref-type';
import { RefTypeAppartenanceService } from 'src/app/services/ref/type/ref-type-appartenance.service';

@Component({
  selector: 'app-appartenance',
  templateUrl: './appartenance.component.html',
  styleUrls: ['./appartenance.component.css']
})
export class AppartenanceComponent implements OnInit {

  appartenanceList: GenericRefType[] = [];

  nouveauTypeAppartenance: GenericRefType = new GenericRefType;

  showAddNouveauTypeAppartenancePopin: boolean = false;

  modification: boolean = false;

  constructor(private refTypeAppartenanceService: RefTypeAppartenanceService) { }

  ngOnInit(): void {
    this.loadRefTypeAppartenance();
  }

  loadRefTypeAppartenance(): void {
    this.refTypeAppartenanceService.findAll().subscribe(data => this.appartenanceList = data);
  }

  onNouveauTypeAppartenanceBtnClick(): void {
    this.showAddNouveauTypeAppartenancePopin = true;
  }

  onNouveauTypeAppartenancePopinCancelBtnClick(): void {
    this.showAddNouveauTypeAppartenancePopin = false;
    this.nouveauTypeAppartenance = new GenericRefType;
    this.modification = false;
  }

  onAppartenanceFormSubmit(): void {
    this.refTypeAppartenanceService.save(this.nouveauTypeAppartenance)
      .subscribe(() => {
        this.showAddNouveauTypeAppartenancePopin = false;
        this.loadRefTypeAppartenance();
        this.nouveauTypeAppartenance = new GenericRefType;
        this.modification = false;
      });
  }

  editAppartenance(refTypeAppartenance: GenericRefType) {
    this.nouveauTypeAppartenance = {...refTypeAppartenance};
    this.modification = true;
    this.showAddNouveauTypeAppartenancePopin = true;
  }

  onHideNouveauTypeAppartenancePopin() {
    this.onNouveauTypeAppartenancePopinCancelBtnClick();
  }

}
