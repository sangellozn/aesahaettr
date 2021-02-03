import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Objet } from 'src/app/bean/objets/objet';
import { ReferentielItem } from 'src/app/bean/referentiel-item';
import { ObjetsService } from 'src/app/services/objets.service';
import { ReferentielService } from 'src/app/services/ref/referentiel.service';

@Component({
  selector: 'app-objet-form',
  templateUrl: './objet-form.component.html',
  styleUrls: ['./objet-form.component.css']
})
export class ObjetFormComponent implements OnInit {

  objet: Objet = new Objet;

  refTypeObjet: ReferentielItem[] = [];

  refTypeAppartenance: ReferentielItem[] = [];

  personnes: ReferentielItem[] = [{code: '', libelle: 'Aucune personne sélectionnée'}];

  modification: boolean = false;

  addToPersonne: boolean = false;

  constructor(private route: ActivatedRoute, 
    private objetsService: ObjetsService, 
    private router: Router,
    private referentielService: ReferentielService) { }

  ngOnInit(): void {
    if (this.route.snapshot.paramMap.has('id')) {
      const id = this.route.snapshot.paramMap.get('id');
      this.objetsService.getById(id).subscribe(data => {this.objet = data.toObjet(); this.modification = true});
    }
    this.referentielService.findAllTypeObjet().subscribe(data => this.refTypeObjet = data);
    this.referentielService.findAllTypeAppartenance().subscribe(data => this.refTypeAppartenance = data);
    this.referentielService.findAllPersonnes().subscribe(data => this.personnes = this.personnes.concat(data));
  }

  onObjetFormSubmit(): void {
    if (this.objet.id) {
      this.objetsService.update(this.objet).subscribe(data => this.router.navigate(['/objets', data.id]));
    } else {
      this.objetsService.save(this.objet).subscribe(data => this.router.navigate(['/objets', data.id]));
    }
  }

  onBackButtonClick(): void {
    if (this.objet.id) {
      this.router.navigate(['objets', this.objet.id]);
    } else {
      this.router.navigate(['objets']);
    }
  }

}
