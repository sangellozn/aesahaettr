import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Personne } from 'src/app/bean/personnes/personne';
import { PersonnesService } from 'src/app/services/personnes.service';

@Component({
  selector: 'app-personne-form',
  templateUrl: './personne-form.component.html',
  styleUrls: ['./personne-form.component.css']
})
export class PersonneFormComponent implements OnInit {

  personne: Personne = new Personne;

  constructor(private route: ActivatedRoute, private personnesService: PersonnesService, private router: Router) { }

  ngOnInit(): void {
    if (this.route.snapshot.paramMap.has('id')) {
      console.debug('charger personne');
    } else {
      console.log('Nouvelle personne');
    }
  }

  onPersonneFormSubmit(): void {
    this.personnesService.save(this.personne).subscribe(data => this.router.navigate(['/personnes', {id: data.id}]));
  }

}
