import { Component, OnInit } from '@angular/core';
import { ObjetListItem } from 'src/app/bean/objets/objet-list-item';
import { ObjetsService } from 'src/app/services/objets.service';

@Component({
  selector: 'app-objets-list',
  templateUrl: './objet-list.component.html',
  styleUrls: ['./objet-list.component.css']
})
export class ObjetListComponent implements OnInit {

  objetList: ObjetListItem[] = [];

  constructor(private objetsService: ObjetsService) { }

  ngOnInit(): void {
    this.loadObjetList();
  }

  loadObjetList() {
    this.objetsService.findAll().subscribe(data => this.objetList = data);
  }

}
