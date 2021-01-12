import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { GenericRefType } from 'src/app/bean/ref/type/generic-ref-type';
import { environment } from 'src/environments/environment';
import { AbstractAppService } from '../../abstract-app.service';

@Injectable({
  providedIn: 'root'
})
export class RefTypeContactService extends AbstractAppService {

  private url = `${environment.baseUrl}/ref/type/contact`;

  constructor(http: HttpClient, messageService: MessageService) {
    super(http, messageService);
  }

  findAll(): Observable<GenericRefType[]> {
    return this.http.get<GenericRefType[]>(this.url).pipe(catchError(this.throwError()));
  }

  save(pays: GenericRefType): Observable<GenericRefType> {
    return this.http.post<GenericRefType>(this.url, pays).pipe(
      tap(() => this.messageService.add({ severity: 'success', summary: 'Création/Modification', detail: 'Le type a été créé/modifié avec succès.' })),
      catchError(this.throwError()));
  }
}
