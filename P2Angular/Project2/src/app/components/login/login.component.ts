import { Component, OnInit } from '@angular/core';
import { Users } from 'src/app/models/users';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // dbUser!: Users;
  // validateUser: Users;
  constructor() { }

  ngOnInit(): void {
  }

  // loginNow() {
  //     console.log(this.validateUser);
  //     this.loginUser(this.validateUser);
  //   }

}
