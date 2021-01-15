import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { PersonneListItem } from '../bean/personnes/personne-list-item';
import { AbstractAppService } from './abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class PersonnesService extends AbstractAppService {

  private url = `${environment.baseUrl}/personnes`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  findAll(): Observable<PersonneListItem[]> {
    return this.http.get<PersonneListItem[]>(this.url).pipe(catchError(this.throwError()));
  }

}
