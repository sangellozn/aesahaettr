import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Localisation } from '../bean/personnes/localisation';
import { AbstractAppService } from './abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class LocalisationsService extends AbstractAppService {

  private url = `${environment.baseUrl}/personnes`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  save(localisation: Localisation): Observable<Localisation> {
    const {personneId} = localisation;
    return this.http.post<Localisation>(`${this.url}/${personneId}/localisations`, localisation).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création', detail: 'La localisation a été créée avec succès.' })),
      catchError(this.throwError()));
  }

  update(localisation: Localisation): Observable<Localisation> {
    const { id, personneId } = localisation;
    return this.http.put<Localisation>(`${this.url}/${personneId}/localisations/${id}`, localisation).pipe(
      map((value: Localisation) => Localisation.fromJson(value)),
      tap(() => this.messageService.add({ severity: 'success', summary: 'Modification', detail: 'La localisation a été modifiée avec succès.' })),
      catchError(this.throwError()));
  }
  
}
