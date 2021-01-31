import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
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

  quickAddType: string = '';

  constructor(private route: ActivatedRoute, 
    private personnesService: PersonnesService,
    private router: Router) { }

  ngOnInit(): void {
    this.loadPersonne();
    this.menuItems = this.getMenuItems();
  }

  loadPersonne(): void {
    this.personnesService.getById(this.route.snapshot.paramMap.get('id')).subscribe(data => this.personne = data);
  }

  onQuickAddActionCompleted(reload: boolean): void {
    if (reload) {
      this.loadPersonne();
    }
    this.quickAddType = '';
  }

  onAddLocalisationButtonClick(): void {
    this.quickAddType = 'LOCALISATION';
  }

  onAddEvenementButtonClick(): void {
    this.quickAddType = 'EVENEMENT';
  }

  onEditButtonClick(): void {
    this.router.navigate(['personnes', this.personne.id, 'edit']);
  }

  getMenuItems(): MenuItem[] {
    return [
      {
        label: 'Ajouter une nouvelle localisation', icon: 'pi pi-home', command: () => {
          this.onAddLocalisationButtonClick();
        }
      },
      {
        label: 'Ajouter un nouveau moyen de contact', icon: 'pi pi-phone', command: () => {

        }
      },
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
          this.onAddEvenementButtonClick();
        }
      }      
    ];
  }

}
