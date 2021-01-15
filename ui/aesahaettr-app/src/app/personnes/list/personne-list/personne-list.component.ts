import { Component, OnInit } from '@angular/core';
import { PersonneListItem } from 'src/app/bean/personnes/personne-list-item';
import { PersonnesService } from 'src/app/services/personnes.service';

@Component({
  selector: 'app-personne-list',
  templateUrl: './personne-list.component.html',
  styleUrls: ['./personne-list.component.css']
})
export class PersonneListComponent implements OnInit {

  personneList: PersonneListItem[] = [];

  constructor(private personnesService: PersonnesService) { }

  ngOnInit(): void {

  }

  editPersonne(personne: PersonneListItem) {
    
  }

  loadPersonneList() {
    this.personnesService.findAll().subscribe(data => this.personneList = data);
  }

}
