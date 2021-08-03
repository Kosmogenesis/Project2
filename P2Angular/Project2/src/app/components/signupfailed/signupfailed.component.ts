import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signupfailed',
  templateUrl: './signupfailed.component.html',
  styleUrls: ['./signupfailed.component.css']
})
export class SignupfailedComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.router.navigate(['signup-failed'])
  }

}
