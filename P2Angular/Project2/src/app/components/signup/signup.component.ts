import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Users } from 'src/app/models/users';
import { SignupService } from 'src/app/services/signup.service';
import { FormControl, FormGroup, Validators, FormBuilder } from '@angular/forms';



@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

 

  
    // signupForm = new FormGroup({
    // firstName: new FormControl('', Validators.required),
    // lastName: new FormControl('', Validators.required),
    // email: new FormControl('', Validators.required),
    // username: new FormControl('', Validators.required),
    // password: new FormControl('', Validators.required)
    // })
  
    // get email(){return this.signupForm.get('email')}

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
        if (this.firstName == "" || this.lastName == "" || this.email == "" || this.username == "" || this.password == "") {
          console.log("field is null")
          this.router.navigate(['signup-failed'])
        } else {
          console.log("response received");
          this.msg = "Registration Successful!"
          this.router.navigate(['login']);
        }
      },
      error => {
        console.log("exception occured");
        this.msg = error.error;
      }
    )
  }

}
