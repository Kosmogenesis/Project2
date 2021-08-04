import { Component, OnInit } from '@angular/core';
import { CardService } from 'src/app/services/card.service';
import { Cards } from 'src/app/models/cards';
import { Router, RouterLinkWithHref } from '@angular/router';


@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})
export class HistoryComponent implements OnInit {

  cards?: Cards[];
  usernameNow = sessionStorage.getItem('username')

  constructor(private router:Router, private cs: CardService) { }

  ngOnInit(): void {
    this.getAllHistoryCards();
    
    this.usernameNow;
  }

  getAllHistoryCards(): void{
    this.cs.getAllHistoryCards().subscribe(
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
