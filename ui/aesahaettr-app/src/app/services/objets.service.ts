import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Objet } from '../bean/objets/objet';
import { ObjetListItem } from '../bean/objets/objet-list-item';
import { AbstractAppService } from './abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class ObjetsService extends AbstractAppService {

  private url = `${environment.baseUrl}/objets`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  findAll(): Observable<ObjetListItem[]> {
    return this.http.get<ObjetListItem[]>(this.url).pipe(catchError(this.throwError()));
  }

  save(objet: Objet): Observable<Objet> {
    return this.http.post<Objet>(this.url, objet).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'L\'objet a été créée avec succès.' })),
      catchError(this.throwError()));
  }
  
}
