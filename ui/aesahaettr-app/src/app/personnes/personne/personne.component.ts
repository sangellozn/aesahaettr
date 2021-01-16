import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { PersonneFull } from 'src/app/bean/personnes/personne-full';
import { PersonnesService } from 'src/app/services/personnes.service';

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.css']
})
export class PersonneComponent implements OnInit {

  personne: PersonneFull = new PersonneFull;

  menuItems: MenuItem[] = [];

  constructor(private route: ActivatedRoute, private personnesService: PersonnesService) { }

  ngOnInit(): void {
    this.personnesService.getById(this.route.snapshot.paramMap.get('id')).subscribe(data => this.personne = data);
    this.menuItems = this.getMenuItems();
  }

  getMenuItems(): MenuItem[] {
    return [
      {
        label: 'Ajouter une relation', icon: 'pi pi-share-alt', command: () => {

        }
      },
      {
        label: 'Ajouter une possession', icon: 'pi pi-tablet', command: () => {

        }
      },
      {
        label: 'Créer un nouvel événement', icon: 'pi pi-info-circle', command: () => {

        }
      },
      {
        label: 'Ajouter un nouveau moyen de contact', icon: 'pi pi-phone', command: () => {

        }
      },
      {
        label: 'Ajouter une nouvelle localisation', icon: 'pi pi-home', command: () => {

        }
      }
    ];
  }

}
