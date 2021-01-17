import { Component, Input, OnInit, ViewEncapsulation } from '@angular/core';
import { Localisation } from 'src/app/bean/personnes/localisation';

@Component({
  selector: 'app-localisation-list',
  templateUrl: './localisation-list.component.html',
  styleUrls: ['./localisation-list.component.css']
})
export class LocalisationListComponent implements OnInit {

  @Input() localisations: Localisation[] = [];

  constructor() { }

  ngOnInit() {
    
  }

}
