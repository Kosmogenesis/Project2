import { Component, OnInit } from '@angular/core';
import { CardService } from 'src/app/services/card.service';
import { Cards } from 'src/app/models/cards';
import { Router, RouterLinkWithHref } from '@angular/router';


@Component({
  selector: 'app-math',
  templateUrl: './math.component.html',
  styleUrls: ['./math.component.css']
})
export class MathComponent implements OnInit {

  cards?: Cards[];
  usernameNow = sessionStorage.getItem('username')

  constructor(private router:Router, private cs: CardService) { }

  ngOnInit(): void {
    // this.router.navigate(['math']);
    this.getAllMathCards();
    
    this.usernameNow;
  }

  getAllMathCards(): void{
    this.cs.getAllMathCards().subscribe(
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
