import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PaysService {

  private url = `${environment.baseUrl}/ref/pays`;

  constructor(private http: HttpClient) { }
}
