import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Personne } from '../bean/personnes/personne';
import { PersonneFull } from '../bean/personnes/personne-full';
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

  save(personne: Personne): Observable<Personne> {
    return this.http.post<Personne>(this.url, personne).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'La personne a été créée avec succès.' })),
      catchError(this.throwError()));
  }

  getById(id: string): Observable<PersonneFull> {
    return this.http.get<PersonneFull>(`${this.url}/${id}`).pipe(
      map((value: PersonneFull) => PersonneFull.fromJson(value)),
      catchError(this.throwError()));
  }

  update(personne: Personne): Observable<PersonneFull> {
    const { id } = personne;
    return this.http.put<PersonneFull>(`${this.url}/${id}`, personne).pipe(
      map((value: PersonneFull) => PersonneFull.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'La personne a été modifiée avec succès.' })),
      catchError(this.throwError()));
  }

}
