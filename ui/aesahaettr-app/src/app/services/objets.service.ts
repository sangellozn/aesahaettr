import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Objet } from '../bean/objets/objet';
import { ObjetFull } from '../bean/objets/objet-full';
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

  getById(id: string): Observable<ObjetFull> {
    return this.http.get<ObjetFull>(`${this.url}/${id}`).pipe(
      map((value: ObjetFull) => ObjetFull.fromJson(value)),
      catchError(this.throwError()));
  }

  update(objet: Objet): Observable<ObjetFull> {
    const { id } = objet;
    return this.http.put<ObjetFull>(`${this.url}/${id}`, objet).pipe(
      map((value: ObjetFull) => ObjetFull.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'L\'objet a été modifiée avec succès.' })),
      catchError(this.throwError()));
  }
  
}
