import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Personne } from 'src/app/bean/personnes/personne';

@Component({
  selector: 'app-personne-form',
  templateUrl: './personne-form.component.html',
  styleUrls: ['./personne-form.component.css']
})
export class PersonneFormComponent implements OnInit {

  personne: Personne = new Personne;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    if (this.route.snapshot.paramMap.has('id')) {
      console.debug('charger personne');
    } else {
      console.log('Nouvelle personne');
    }
  }

  onPersonneFormSubmit(): void {
    
  }

}
