// import { Component, OnInit, Input } from '@angular/core';
// import { Users } from '../../models/users'
// import { HttpClientModule, HttpClient, HttpHeaders } from '@angular/common/http';
// import { LoginService } from '../../services/login.service'
// import { Router } from '@angular/router';

// const HTTP_OPTIONS = {
//   headers: new HttpHeaders({
//     'Content-Type': 'application/json'
//   })}

// @Component({
//   selector: 'app-login-box',
//   templateUrl: './login-box.component.html',
//   styleUrls: ['./login-box.component.css']
// })


// export class LoginBoxComponent implements OnInit {

//   dbUser!: Users;
//   validateUser!: Users;
//     constructor(private loginService: LoginService,private ROUTE: Router) { }

//   incorrect: boolean = false;
  
  
//   ngOnInit() {
//     this.validateUser = {
//       id: 0,
//       email: "",
//       password: "",
//       firstName: "",
//       lastName: "",
//       card_id: Users,
//       username: ""
//     };
//   }
//     loginNow() {
//       console.log(this.validateUser);
//       this.loginUser(this.validateUser);
//     }
  
//     loginUser(user: Users){
//       this.loginService.validLoginUser(user).subscribe(
//         succ => {
//           this.dbUser = succ;
//           this.incorrect = false;
//           this.loginService.saveUser(succ);
//           this.ROUTE.navigate(['dashboard']);
//         }, err => {
//           console.log('login failed')
//           this.incorrect = true;
//           // this.loginService.dbUser = this.validateUser;
//           // this.ROUTE.navigate(['dashboard']);
//         }
//         );
//     }}
