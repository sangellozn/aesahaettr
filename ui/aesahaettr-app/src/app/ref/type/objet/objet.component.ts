import { Component, OnInit } from '@angular/core';
import { GenericRefType } from 'src/app/bean/ref/type/generic-ref-type';
import { RefTypeObjetService } from 'src/app/services/ref/type/ref-type-objet.service';

@Component({
  selector: 'app-objet',
  templateUrl: './objet.component.html',
  styleUrls: ['./objet.component.css']
})
export class ObjetComponent implements OnInit {

  objetList: GenericRefType[] = [];

  nouveauTypeObjet: GenericRefType = new GenericRefType;

  showAddNouveauTypeObjetPopin: boolean = false;

  modification: boolean = false;

  constructor(private refTypeObjetService: RefTypeObjetService) { }

  ngOnInit(): void {
    this.loadRefTypeObjet();
  }

  loadRefTypeObjet(): void {
    this.refTypeObjetService.findAll().subscribe(data => this.objetList = data);
  }

  onNouveauTypeObjetBtnClick(): void {
    this.showAddNouveauTypeObjetPopin = true;
  }

  onNouveauTypeObjetPopinCancelBtnClick(): void {
    this.showAddNouveauTypeObjetPopin = false;
    this.nouveauTypeObjet = new GenericRefType;
    this.modification = false;
  }

  onObjetFormSubmit(): void {
    this.refTypeObjetService.save(this.nouveauTypeObjet)
      .subscribe(() => {
        this.showAddNouveauTypeObjetPopin = false;
        this.loadRefTypeObjet();
        this.nouveauTypeObjet = new GenericRefType;
        this.modification = false;
      });
  }

  editObjet(refTypeObjet: GenericRefType) {
    this.nouveauTypeObjet = {...refTypeObjet};
    this.modification = true;
    this.showAddNouveauTypeObjetPopin = true;
  }

  onHideNouveauTypeObjetPopin() {
    this.onNouveauTypeObjetPopinCancelBtnClick();
  }

}
