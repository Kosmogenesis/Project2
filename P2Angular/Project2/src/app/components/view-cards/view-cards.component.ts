import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Cards } from 'src/app/models/cards';
import { CardService } from 'src/app/services/card.service';





@Component({
  selector: 'app-view-cards',
  templateUrl: './view-cards.component.html',
  styleUrls: ['./view-cards.component.css']
})
export class ViewCardsComponent implements OnInit {

  cards?: Cards[];

  usernameNow = sessionStorage.getItem('username')

  constructor(private router: Router, private http: HttpClient, private cs: CardService) { }

 

  ngOnInit(): void {
    this.getCards();
    this.usernameNow
    
  }

  getCards(): void{
    this.cs.getAllCards().subscribe(
      data => {
        this.cards = data;
        console.log(this.cards);
       
      },
      error => {
      console.log(error)
      }
    )
  }
  
// loginNow() {
//     //console.log(this.validateUser);
//     //this.loginUser(this.validateUser);
//     console.log(this.username)
//     console.log(this.password)
//     let validateUser = {
//       username: this.username,
//       password: this.password
//     }
//     this.loginService.validLoginUser(validateUser).subscribe(
//       succ => {
//         console.log('login success')
//         //this.dbUser = succ;
//         //this.incorrect = false;
//         //this.loginService.saveUser(succ);
//         sessionStorage.setItem('username', this.username)
//         this.ROUTE.navigate(['home']);
//       }, err => {
//         console.log('login failed')
//         //this.incorrect = true;
//         // this.loginService.dbUser = this.validateUser;
//         // this.ROUTE.navigate(['dashboard']);
//       }
//       );
//   }



}
