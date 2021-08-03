import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cards } from 'src/app/models/cards';
import { CardService } from 'src/app/services/card.service';

@Component({
  selector: 'app-red',
  templateUrl: './red.component.html',
  styleUrls: ['./red.component.css']
})
export class RedComponent implements OnInit {

  cards?: Cards[];
  
  usernameNow = sessionStorage.getItem('username')

  constructor(private router: Router, private cs: CardService) { }

  ngOnInit(): void {
   
    this.getAllRedCards();
    
    this.usernameNow;
  }

   getAllRedCards(): void{
    this.cs.getAllRedCards().subscribe(
      data => {
        this.cards = data;
        console.log(this.cards);
       
      },
      error => {
      console.log(error)
      }
    )
   }
  
  getRedCardsOfUser2(): void{
    this.cs.getRedCardsByUser2().subscribe(
      data => {
        this.cards = data;
        console.log(this.cards);
       
      },
      error => {
      console.log(error)
      }
    )
  }

  getRedCardsOfUser3(): void{
    this.cs.getRedCardsByUser3().subscribe(
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
