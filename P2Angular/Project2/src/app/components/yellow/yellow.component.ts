import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cards } from 'src/app/models/cards';
import { CardService } from 'src/app/services/card.service';

@Component({
  selector: 'app-yellow',
  templateUrl: './yellow.component.html',
  styleUrls: ['./yellow.component.css']
})
export class YellowComponent implements OnInit {

   cards?: Cards[];
  
  usernameNow = sessionStorage.getItem('username')


  constructor(private router:Router, private cs: CardService) { }

  ngOnInit(): void {
   this.getAllYellowCards();
    
    this.usernameNow;
  }

   getAllYellowCards(): void{
    this.cs.getAllYellowCards().subscribe(
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
