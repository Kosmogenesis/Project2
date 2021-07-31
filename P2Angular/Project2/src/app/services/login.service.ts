import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Users } from '../models/users';
import { environment } from 'src/environments/environment';

const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  dbUser!: Users;

  constructor(private http: HttpClient) { }
  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }
  

validLoginUser(user:object): Observable<Users>{
  return this.http.post<Users>("http://localhost:8080/Project2/login", user, HTTP_OPTIONS);
}

  getUser(): Users{
  
  return this.dbUser;
}
  
  saveUser(save: Users): void{
    this.dbUser = save;
  }
  
  getUserById(id: number): Observable<Users>{
    return this.http.get<Users>("http://localhost:8080/Project2/user/id?id=" + id, HTTP_OPTIONS);
  }

 
}
