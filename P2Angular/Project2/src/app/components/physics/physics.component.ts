import { Component, OnInit } from '@angular/core';
import { CardService } from 'src/app/services/card.service';
import { Cards } from 'src/app/models/cards';
import { Router, RouterLinkWithHref } from '@angular/router';

@Component({
  selector: 'app-physics',
  templateUrl: './physics.component.html',
  styleUrls: ['./physics.component.css']
})
export class PhysicsComponent implements OnInit {

  cards?: Cards[];
  usernameNow = sessionStorage.getItem('username')

  constructor(private router:Router, private cs: CardService) { }

  ngOnInit(): void {
    // this.router.navigate(['math']);
    this.getAllPhysicsCards();
    
    this.usernameNow;
  }

  getAllPhysicsCards(): void{
    this.cs.getAllPhysicsCards().subscribe(
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
