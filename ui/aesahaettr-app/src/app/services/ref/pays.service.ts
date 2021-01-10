import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { Pays } from 'src/app/bean/ref/pays';
import { environment } from 'src/environments/environment';
import { AbstractAppService } from '../abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class PaysService extends AbstractAppService {

  private url = `${environment.baseUrl}/ref/pays`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  findAll(): Observable<Pays[]> {
    return this.http.get<Pays[]>(this.url).pipe(catchError(this.throwError()));
  }

  save(pays: Pays): Observable<Pays> {
    return this.http.post<Pays>(this.url, pays).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création/Modification', detail: 'Le pays a été créé/modifié avec succès.' })),
      catchError(this.throwError()));
  }

}
