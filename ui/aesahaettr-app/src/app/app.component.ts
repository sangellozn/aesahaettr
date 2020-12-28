import { Component, OnInit } from '@angular/core';
import { Greetings } from './bean/greetings';
import { HomeService } from './services/home.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  greetings: Greetings;
  
  constructor(private homService: HomeService) {}

  ngOnInit() {
    this.homService.getGreeting().subscribe(grettings => this.greetings = grettings);
  }

}
