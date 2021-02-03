import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Evenement } from '../bean/evenements/evenement';
import { AbstractAppService } from './abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class EvenementsService extends AbstractAppService {

  private urlPersonnes = `${environment.baseUrl}/personnes`;

  private urlObjets = `${environment.baseUrl}/objets`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  saveForPersonne(evenement: Evenement): Observable<Evenement> {
    const {elementId} = evenement;
    return this.http.post<Evenement>(`${this.urlPersonnes}/${elementId}/evenements`, evenement).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'L\'événement a été créé avec succès.' })),
      catchError(this.throwError()));
  }

  updateForPersonne(evenement: Evenement): Observable<Evenement> {
    const { id, elementId } = evenement;
    return this.http.put<Evenement>(`${this.urlPersonnes}/${elementId}/evenements/${id}`, evenement).pipe(
      map((value: Evenement) => Evenement.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'L\'événement a été modifié avec succès.' })),
      catchError(this.throwError()));
  }

  saveForObjet(evenement: Evenement): Observable<Evenement> {
    const {elementId} = evenement;
    return this.http.post<Evenement>(`${this.urlObjets}/${elementId}/evenements`, evenement).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'L\'événement a été créé avec succès.' })),
      catchError(this.throwError()));
  }

  updateForObjet(evenement: Evenement): Observable<Evenement> {
    const { id, elementId } = evenement;
    return this.http.put<Evenement>(`${this.urlObjets}/${elementId}/evenements/${id}`, evenement).pipe(
      map((value: Evenement) => Evenement.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'L\'événement a été modifié avec succès.' })),
      catchError(this.throwError()));
  }

}
