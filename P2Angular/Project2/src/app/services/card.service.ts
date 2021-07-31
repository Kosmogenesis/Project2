import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Cards } from '../models/cards';
import { Observable } from 'rxjs';

const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}
@Injectable({
  providedIn: 'root'
})
export class CardService {

  constructor(private http: HttpClient) { }
  

  getAllCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllCards", HTTP_OPTIONS);
  }

  createCard(card: any): Observable<Cards>{
    return this.http.post<Cards>("http://localhost:8080/Project2/createcard", card, HTTP_OPTIONS);
  }

  

  
}
