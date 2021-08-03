import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cards } from 'src/app/models/cards';
import { CardService } from 'src/app/services/card.service';

@Component({
  selector: 'app-take-a-test',
  templateUrl: './take-a-test.component.html',
  styleUrls: ['./take-a-test.component.css']
  
})
  


export class TakeATestComponent implements OnInit {
  cards?: Cards[];
  card!: Cards;
  index = 0;
  testAmt = 0;
  moreQ = true;
  score = 0;

usernameNow = sessionStorage.getItem('username')

  constructor(private router: Router, private cs: CardService) { }

  ngOnInit(): void {
     this.getCards();
    this.usernameNow;
  }

  getCards(): void {
    this.cs.getAllCards().subscribe(
      data => {
        this.cards = data;
        this.testAmt = this.cards.length;
        this.card = data[0];
        console.log(this.cards);
      },
      error => {
        console.log(error)
      }
    )
  }

  nextCards(): void {
    this.index+=1
    if(this.index >= this.testAmt){
      this.moreQ = false;
    }
    this.cs.getAllCards().subscribe(
      data => {
        this.cards = data;
        this.card = data[this.index];
        console.log(this.cards.length);
      },
      error => {
        console.log(error)
      }
    )
  }

  rightCards(): void {
    this.score += 100
     this.index+=1
    if(this.index >= this.testAmt){
      this.moreQ = false;
    }
    this.cs.getAllCards().subscribe(
      data => {
        this.cards = data;
        this.card = data[this.index];
        console.log(this.cards.length);
      },
      error => {
        console.log(error)
      }
    )
 
  }

  wrongCards(): void {
    this.index += 1
    if (this.index >= this.testAmt) {
      this.moreQ = false;
    }
    this.cs.getAllCards().subscribe(
      data => {
        this.cards = data;
        this.card = data[this.index];
        console.log(this.cards.length);
      },
      error => {
        console.log(error)
      }
    )
  }

  finishCards(): void {
    alert("Your Score is " + this.score);
    this.index = 0;
    this.score = 0;
    this.moreQ = true;
    this.getCards();
  }

}
