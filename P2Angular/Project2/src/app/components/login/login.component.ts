import { Component, OnInit, Input } from '@angular/core';
import { Users } from 'src/app/models/users';
import { HttpClientModule, HttpClient, HttpHeaders } from '@angular/common/http';
import { LoginService } from 'src/app/services/login.service';
import { Router } from '@angular/router';

const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })}





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
 


  ngOnInit(): void {

  };

  loginNow() {
    //console.log(this.validateUser);
    //this.loginUser(this.validateUser);
    console.log(this.username)
    console.log(this.password)
    let validateUser = {
      username: this.username,
      password: this.password
    }
    this.loginService.validLoginUser(validateUser).subscribe(
      succ => {
        if (this.username == "" || this.password == "") {
          console.log("field is null")
          this.ROUTE.navigate(['login-failed'])
        } else {
          console.log('login success')
          //this.dbUser = succ;
          //this.incorrect = false;
          //this.loginService.saveUser(succ);
          sessionStorage.setItem('username', this.username)
          this.ROUTE.navigate(['home']);
        }
      }, err => {
        console.log('login failed')
        this.ROUTE.navigate(['login-failed'])
        //this.incorrect = true;
        // this.loginService.dbUser = this.validateUser;
        // this.ROUTE.navigate(['dashboard']);
      }
      );
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('username')
  }

  //  checkLogin() {
  //   if (this.LoginService.authenticate(this.username, this.password)
  //   ) {
  //     this.router.navigate([''])
  //     this.invalidLogin = false
  //   } else
  //     this.invalidLogin = true
  // }




  // loginNow() {
  //     console.log(this.validateUser);
  //     this.loginUser(this.validateUser);
  //   }


}