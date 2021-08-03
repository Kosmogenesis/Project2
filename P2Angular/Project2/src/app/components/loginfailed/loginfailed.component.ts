import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginfailed',
  templateUrl: './loginfailed.component.html',
  styleUrls: ['./loginfailed.component.css']
})
export class LoginfailedComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
    this.router.navigate(['login-failed']);
  }

}
