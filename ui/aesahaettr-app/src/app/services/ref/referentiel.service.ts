import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { ReferentielItem } from 'src/app/bean/referentiel-item';
import { environment } from 'src/environments/environment';
import { AbstractAppService } from '../abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class ReferentielService extends AbstractAppService {

  private url = `${environment.baseUrl}/referentiels`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  findAllLocalisation(): Observable<ReferentielItem[]> {
    return this.http.get<ReferentielItem[]>(`${this.url}/localisations`).pipe(catchError(this.throwError()));
  }

  findAllPays(): Observable<ReferentielItem[]> {
    return this.http.get<ReferentielItem[]>(`${this.url}/pays`).pipe(catchError(this.throwError()));
  }

}
