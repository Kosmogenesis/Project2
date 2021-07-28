import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './components/aboutus/aboutus.component';

import { HomeComponent } from './components/home/home.component';

//import { LoginBoxComponent } from './components/login-box/login-box.component';

import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { WelcomeComponent } from './components/welcome/welcome.component';


const routes: Routes = [
 {
   path:'welcome',
   component:WelcomeComponent
  },

  {
   path:'', //the empty String makes this component appear given the base URL (on launch)
   component:WelcomeComponent //so when I go to localhost:4200, we'll get this component
  },

  {
   path:'aboutus', //the empty String makes this component appear given the base URL (on launch)
   component:AboutusComponent //so when I go to localhost:4200, we'll get this component
  },

  {
   path:'login', //the empty String makes this component appear given the base URL (on launch)
   component:LoginComponent //so when I go to localhost:4200, we'll get this component
  },

  {
   path:'signup', //the empty String makes this component appear given the base URL (on launch)
   component:SignupComponent //so when I go to localhost:4200, we'll get this component
  },

  {
    path:'home', //the empty String makes this component appear given the base URL (on launch)
    component:HomeComponent //so when I go to localhost:4200, we'll get this component
   }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
