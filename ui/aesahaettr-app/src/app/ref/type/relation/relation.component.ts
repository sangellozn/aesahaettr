import { Component, OnInit } from '@angular/core';
import { GenericRefType } from 'src/app/bean/ref/type/generic-ref-type';
import { RefTypeRelationService } from 'src/app/services/ref/type/ref-type-relation.service';

@Component({
  selector: 'app-relation',
  templateUrl: './relation.component.html',
  styleUrls: ['./relation.component.css']
})
export class RelationComponent implements OnInit {

  relationList: GenericRefType[] = [];

  nouveauTypeRelation: GenericRefType = new GenericRefType;

  showAddNouveauTypeRelationPopin: boolean = false;

  modification: boolean = false;

  constructor(private refTypeRelationService: RefTypeRelationService) { }

  ngOnInit(): void {
    this.loadRefTypeRelation();
  }

  loadRefTypeRelation(): void {
    this.refTypeRelationService.findAll().subscribe(data => this.relationList = data);
  }

  onNouveauTypeRelationBtnClick(): void {
    this.showAddNouveauTypeRelationPopin = true;
  }

  onNouveauTypeRelationPopinCancelBtnClick(): void {
    this.showAddNouveauTypeRelationPopin = false;
    this.nouveauTypeRelation = new GenericRefType;
    this.modification = false;
  }

  onRelationFormSubmit(): void {
    this.refTypeRelationService.save(this.nouveauTypeRelation)
      .subscribe(() => {
        this.showAddNouveauTypeRelationPopin = false;
        this.loadRefTypeRelation();
        this.nouveauTypeRelation = new GenericRefType;
        this.modification = false;
      });
  }

  editRelation(refTypeRelation: GenericRefType) {
    this.nouveauTypeRelation = {...refTypeRelation};
    this.modification = true;
    this.showAddNouveauTypeRelationPopin = true;
  }

  onHideNouveauTypeRelationPopin() {
    this.onNouveauTypeRelationPopinCancelBtnClick();
  }

}
