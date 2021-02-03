import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { ObjetFull } from 'src/app/bean/objets/objet-full';
import { ReferentielItem } from 'src/app/bean/referentiel-item';
import { ObjetsService } from 'src/app/services/objets.service';
import { ReferentielService } from 'src/app/services/ref/referentiel.service';

@Component({
  selector: 'app-objet',
  templateUrl: './objet.component.html',
  styleUrls: ['./objet.component.css']
})
export class ObjetComponent implements OnInit {

  objet: ObjetFull = new ObjetFull;

  menuItems: MenuItem[] = [];

  quickAddType: string = '';

  refTypeObjets: ReferentielItem[] = [];

  constructor(private route: ActivatedRoute, 
    private objetsService: ObjetsService,
    private referentielService: ReferentielService,
    private router: Router) { }

  ngOnInit(): void {
    this.loadObjet();
    this.menuItems = this.getMenuItems();
  }

  loadObjet(): void {
    this.objetsService.getById(this.route.snapshot.paramMap.get('id')).subscribe(data => this.objet = data);
    this.referentielService.findAllTypeObjet().subscribe(data => this.refTypeObjets = data);
  }

  onQuickAddActionCompleted(reload: boolean): void {
    if (reload) {
      this.loadObjet();
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
    this.router.navigate(['objets', this.objet.id, 'edit']);
  }

  getMenuItems(): MenuItem[] {
    return [
      {
        label: 'Ajouter une nouvelle localisation', icon: 'pi pi-home', command: () => {
          this.onAddLocalisationButtonClick();
        }
      },
      {
        label: 'Créer un nouvel événement', icon: 'pi pi-info-circle', command: () => {
          this.onAddEvenementButtonClick();
        }
      }      
    ];
  }

  getRefTypeObjet(code: string): ReferentielItem {
    return this.refTypeObjets.filter(item => item.code === code)[0] || new ReferentielItem;
  }

}
