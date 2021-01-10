import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
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
    return this.http.get<Pays[]>(this.url).pipe(catchError(this.handleError(new Array<Pays>())));
  }

  save(pays: Pays): Observable<never> {
    return this.http.post<never>(this.url, pays).pipe(catchError(this.throwError()));
  }

}
