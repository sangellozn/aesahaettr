import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Evenement } from 'src/app/bean/evenements/evenement';

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

  modification: boolean = false;

  evenement: Evenement = new Evenement;

  @Output() onEditAddActionCompleted = new EventEmitter<boolean>();

  constructor() { }

  ngOnInit(): void {

  }

  onEvenementFormSubmit(): void {

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
