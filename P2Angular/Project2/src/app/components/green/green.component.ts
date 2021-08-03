import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cards } from 'src/app/models/cards';
import { CardService } from 'src/app/services/card.service';

@Component({
  selector: 'app-green',
  templateUrl: './green.component.html',
  styleUrls: ['./green.component.css']
})
export class GreenComponent implements OnInit {
  cards?: Cards[];
  usernameNow = sessionStorage.getItem('username')

  constructor(private router: Router, private cs: CardService) { }

  ngOnInit(): void {
    this.router.navigate(['green']);
    this.getAllGreenCards();
    
    this.usernameNow;
  }

   getAllGreenCards(): void{
    this.cs.getAllGreenCards().subscribe(
      data => {
        this.cards = data;
        console.log(this.cards);
       
      },
      error => {
      console.log(error)
      }
    )
   }
  
  getGreenCardsOfUser2(): void{
    this.cs.getGreenCardsByUser2().subscribe(
      data => {
        this.cards = data;
        console.log(this.cards);
       
      },
      error => {
      console.log(error)
      }
    )
  }

  getGreenCardsOfUser3(): void{
    this.cs.getGreenCardsByUser3().subscribe(
      data => {
        this.cards = data;
        console.log(this.cards);
       
      },
      error => {
      console.log(error)
      }
    )
  }

}
