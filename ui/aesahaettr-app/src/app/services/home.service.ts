import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Greetings } from '../bean/greetings';
import { environment } from 'src/environments/environment';
import { MessageService } from 'primeng/api';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private url = `${environment.baseUrl}/home`;

  constructor(private http: HttpClient, private messageService: MessageService) { }

  getGreeting() : Observable<Greetings> {
    this.messageService.add({severity:'success', summary:'Service Message', detail:'Via MessageService', life: 300000});
    return this.http.get<Greetings>(this.url);
  }
}
