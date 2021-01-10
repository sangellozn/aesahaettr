import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Greetings } from '../bean/greetings';
import { environment } from 'src/environments/environment';
import { MessageService } from 'primeng/api';

import { catchError } from 'rxjs/operators';
import { AbstractAppService } from './abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class HomeService extends AbstractAppService {

  private url = `${environment.baseUrl}/home`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  getGreeting() : Observable<Greetings> {
    return this.http.get<Greetings>(this.url).pipe(
      catchError(this.handleError(new Greetings))
    );;
  }
}
