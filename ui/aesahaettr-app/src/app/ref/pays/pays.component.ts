import { Component, OnInit } from '@angular/core';
import { of } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Pays } from 'src/app/bean/ref/pays';
import { PaysService } from 'src/app/services/ref/pays.service';

@Component({
  selector: 'app-pays',
  templateUrl: './pays.component.html',
  styleUrls: ['./pays.component.css']
})
export class PaysComponent implements OnInit {

  paysList: Pays[] = [];

  nouveauPays: Pays = new Pays;

  showAddNouveauPaysPopin: boolean = false;

  constructor(private paysService: PaysService) { }

  ngOnInit(): void {
    this.loadPays();
  }

  loadPays(): void {
    this.paysService.findAll().subscribe(data => this.paysList = data);
  }

  onNouveauPaysBtnClick(): void {
    this.showAddNouveauPaysPopin = true;
  }

  onNouveauPaysPopinCancelBtnClick(): void {
    this.showAddNouveauPaysPopin = false;
    this.nouveauPays = new Pays;
  }

  onPaysFormSubmit(): void {
    this.paysService.save(this.nouveauPays)
      .subscribe(() => {
        this.loadPays();
        this.nouveauPays = new Pays;
    });
  }

}
