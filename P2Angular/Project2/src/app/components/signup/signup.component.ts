import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Users } from 'src/app/models/users';
import { SignupService } from 'src/app/services/signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  username = "";
  firstName = "";
  lastName = "";
  email = "";
  password = "";

  // user!: Users;
  msg = "";

  constructor(private router: Router, private _service: SignupService) { }

  ngOnInit(): void {
  }

  registerUser() {
    let user = {
      username: this.username,
      password: this.password,
      firstName: this.firstName,
      lastName: this.lastName,
      email:this.email
    }
    this._service.registerUser(user).subscribe(
      succ => {
        console.log("response received");
        this.msg = "Registration Successful!"
         this.router.navigate(['login']);
      },
      error => {
        console.log("exception occured");
        this.msg = error.error;
      }
    )
  }

}
