import { Component, OnInit } from '@angular/core';
import { CardService } from 'src/app/services/card.service';
import { Cards } from 'src/app/models/cards';
import { Router, RouterLinkWithHref } from '@angular/router';

@Component({
  selector: 'app-cs',
  templateUrl: './cs.component.html',
  styleUrls: ['./cs.component.css']
})
export class CsComponent implements OnInit {

  cards?: Cards[];
  usernameNow = sessionStorage.getItem('username')

  constructor(private router:Router, private cs: CardService) { }
  ngOnInit(): void {
    this.getAllCSCards();
    
    this.usernameNow;
  }

  getAllCSCards(): void{
    this.cs.getAllCSCards().subscribe(
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
