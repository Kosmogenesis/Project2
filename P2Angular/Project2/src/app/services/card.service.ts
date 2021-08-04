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

   changeStatus(card: any): Observable<Cards>{
    return this.http.post<Cards>("http://localhost:8080/Project2/updatestatus", card, HTTP_OPTIONS);
  }


  getCardsByUser1(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getCardsByUser1", HTTP_OPTIONS);
  }

  getCardsByUser2(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getCardsByUser2", HTTP_OPTIONS);
  }

  getCardsByUser3(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getCardsByUser3", HTTP_OPTIONS);
  }

  getAllGreenCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllGreenCards", HTTP_OPTIONS);
  }

   getAllYellowCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllYellowCards", HTTP_OPTIONS);
   }
  
   getAllRedCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllRedCards", HTTP_OPTIONS);
   }
  
   getAllMathCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllCardsByMath", HTTP_OPTIONS);
   }
  
  getAllHistoryCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllCardsByHistory", HTTP_OPTIONS);
  }
  
  getAllPhysicsCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllCardsByPhysics", HTTP_OPTIONS);
  }
  
  getAllCSCards(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllCardsByCS", HTTP_OPTIONS);
   }
  
  //  getAllRedCards(): Observable<Cards[]>{
  //   return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllRedCards", HTTP_OPTIONS);
  //  }
  
  //  getAllRedCards(): Observable<Cards[]>{
  //   return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllRedCards", HTTP_OPTIONS);
  //  }
  
  //  getAllRedCards(): Observable<Cards[]>{
  //   return this.http.get<Cards[]>("http://localhost:8080/Project2/getAllRedCards", HTTP_OPTIONS);
  // }

























  getGreenCardsByUser1(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getGreenCardsByUser1", HTTP_OPTIONS);
  }

   getGreenCardsByUser2(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getGreenCardsByUser2", HTTP_OPTIONS);
   }
  
   getGreenCardsByUser3(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getGreenCardsByUser3", HTTP_OPTIONS);
   }
  
  
  
  
  
  getYellowCardsByUser1(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getYellowCardsByUser1", HTTP_OPTIONS);
  }

  getYellowCardsByUser2(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getYellowCardsByUser2", HTTP_OPTIONS);
  }

  getYellowCardsByUser3(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getYellowCardsByUser3", HTTP_OPTIONS);
  }



  getRedCardsByUser1(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getRedCardsByUser1", HTTP_OPTIONS);
  }

   getRedCardsByUser2(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getRedCardsByUser2", HTTP_OPTIONS);
   }
  
   getRedCardsByUser3(): Observable<Cards[]>{
    return this.http.get<Cards[]>("http://localhost:8080/Project2/getRedCardsByUser3", HTTP_OPTIONS);
  }

 
  

  
}
