
import { Component, OnInit, Input } from '@angular/core';
import { Users } from 'src/app/models/users';
import { HttpClientModule, HttpClient, HttpHeaders } from '@angular/common/http';
import { LoginService } from 'src/app/services/login.service';
import { Router } from '@angular/router';

const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })}


import { Component, OnInit } from '@angular/core';
import { Users } from 'src/app/models/users';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  //dbUser: Users;
  username= "";
  password= "";
  

  constructor(private loginService: LoginService,private ROUTE: Router) { }


  // dbUser!: Users;
  // validateUser: Users;
  constructor() { }


  ngOnInit(): void {

  };

  loginNow() {
    //console.log(this.validateUser);
    //this.loginUser(this.validateUser);
    let validateUser = {
      username: "Mary_Jane",
      password: "Mary2021"
    }
    this.loginService.validLoginUser(validateUser).subscribe(
      succ => {
        console.log('login success')
        //this.dbUser = succ;
        //this.incorrect = false;
        //this.loginService.saveUser(succ);
        this.ROUTE.navigate(['home']);
      }, err => {
        console.log('login failed')
        //this.incorrect = true;
        // this.loginService.dbUser = this.validateUser;
        // this.ROUTE.navigate(['dashboard']);
      }
      );
  }




  // loginNow() {
  //     console.log(this.validateUser);
  //     this.loginUser(this.validateUser);
  //   }


}



