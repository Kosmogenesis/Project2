import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from '../models/users';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }
  

getUsers(username:string, password:string){
  return this.http.get("http://localhost:4200/Project2/") as Observable<Users>
  }
}
