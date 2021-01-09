import { Component, OnInit } from '@angular/core';
import { Greetings } from '../bean/greetings';
import { HomeService } from '../services/home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  greetings: Greetings = new Greetings;
  
  constructor(private homService: HomeService) {}

  ngOnInit() {
    this.homService.getGreeting().subscribe(grettings => this.greetings = grettings);
  }

}
