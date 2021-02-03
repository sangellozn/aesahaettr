import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Localisation } from '../bean/localisations/localisation';
import { AbstractAppService } from './abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class LocalisationsService extends AbstractAppService {

  private urlPersonnes = `${environment.baseUrl}/personnes`;

  private urlObjets = `${environment.baseUrl}/objets`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  saveForPersonne(localisation: Localisation): Observable<Localisation> {
    const {elementId} = localisation;
    return this.http.post<Localisation>(`${this.urlPersonnes}/${elementId}/localisations`, localisation).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'La localisation a été créée avec succès.' })),
      catchError(this.throwError()));
  }

  updateForPersonne(localisation: Localisation): Observable<Localisation> {
    const { id, elementId } = localisation;
    return this.http.put<Localisation>(`${this.urlPersonnes}/${elementId}/localisations/${id}`, localisation).pipe(
      map((value: Localisation) => Localisation.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'La localisation a été modifiée avec succès.' })),
      catchError(this.throwError()));
  }

  saveForObjet(localisation: Localisation): Observable<Localisation> {
    const {elementId} = localisation;
    return this.http.post<Localisation>(`${this.urlObjets}/${elementId}/localisations`, localisation).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'La localisation a été créée avec succès.' })),
      catchError(this.throwError()));
  }

  updateForObjet(localisation: Localisation): Observable<Localisation> {
    const { id, elementId } = localisation;
    return this.http.put<Localisation>(`${this.urlObjets}/${elementId}/localisations/${id}`, localisation).pipe(
      map((value: Localisation) => Localisation.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'La localisation a été modifiée avec succès.' })),
      catchError(this.throwError()));
  }
  
}
