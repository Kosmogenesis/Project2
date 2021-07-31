import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CardService } from 'src/app/services/card.service';

@Component({
  selector: 'app-createcard',
  templateUrl: './createcard.component.html',
  styleUrls: ['./createcard.component.css']
})
export class CreatecardComponent implements OnInit {

  name = "";
  question = "";
  answer = "";
  status = "";
  subject = "";

  msg = "";


  constructor(private router: Router, private service:CardService) { }

  ngOnInit(): void {
  }

  createCard() {
    let username = sessionStorage.getItem('username')
    let card = {
      name: this.name,
      question: this.question,
      answer: this.answer,
      status: this.status,
      subject: this.subject,
      username:username
    }
    this.service.createCard(card).subscribe(
      succ => {
        console.log("response received");
        this.msg = "Registration Successful!"
         this.router.navigate(['view-cards']);
      },
      error => {
        console.log("exception occured");
        this.msg = error.error;
      }
    )
  }

}
