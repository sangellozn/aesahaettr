import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Greetings } from '../bean/greetings';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private url = `${environment.baseUrl}/home`;

  constructor(private http: HttpClient) { }

  getGreeting() : Observable<Greetings> {
    return this.http.get<Greetings>(this.url);
  }
}
