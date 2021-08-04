import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { CreatecardComponent } from './components/createcard/createcard.component';
import { CsComponent } from './components/cs/cs.component';
import { GreenComponent } from './components/green/green.component';
import { HistoryComponent } from './components/history/history.component';

import { HomeComponent } from './components/home/home.component';



import { LoginComponent } from './components/login/login.component';
import { LoginfailedComponent } from './components/loginfailed/loginfailed.component';
import { LogoutComponent } from './components/logout/logout.component';
import { MathComponent } from './components/math/math.component';
import { PhysicsComponent } from './components/physics/physics.component';
import { RedComponent } from './components/red/red.component';
// import { QuizComponent } from './components/quiz/quiz.component';
import { SignupComponent } from './components/signup/signup.component';
import { SignupfailedComponent } from './components/signupfailed/signupfailed.component';
import { StatusroomComponent } from './components/statusroom/statusroom.component';
import { SubjectroomComponent } from './components/subjectroom/subjectroom.component';
import { TakeATestComponent } from './components/take-a-test/take-a-test.component';
import { ViewCardsComponent } from './components/view-cards/view-cards.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { YellowComponent } from './components/yellow/yellow.component';


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
  },
  
  {
    path:'logout', //the empty String makes this component appear given the base URL (on launch)
    component:LogoutComponent //so when I go to localhost:4200, we'll get this component
  },
  
  {
    path:'take-a-test', //the empty String makes this component appear given the base URL (on launch)
    component:TakeATestComponent //so when I go to localhost:4200, we'll get this component
  },

  {
    path:'view-cards', //the empty String makes this component appear given the base URL (on launch)
    component:ViewCardsComponent //so when I go to localhost:4200, we'll get this component
  },
  
  {
    path:'createcard', //the empty String makes this component appear given the base URL (on launch)
    component:CreatecardComponent //so when I go to localhost:4200, we'll get this component
  },

   {
    path:'login-failed', //the empty String makes this component appear given the base URL (on launch)
    component:LoginfailedComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'signup-failed', //the empty String makes this component appear given the base URL (on launch)
    component:SignupfailedComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'green', //the empty String makes this component appear given the base URL (on launch)
    component:GreenComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'yellow', //the empty String makes this component appear given the base URL (on launch)
    component:YellowComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'status-room', //the empty String makes this component appear given the base URL (on launch)
    component:StatusroomComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'red', //the empty String makes this component appear given the base URL (on launch)
    component:RedComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'subject-room', //the empty String makes this component appear given the base URL (on launch)
    component:SubjectroomComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'math', //the empty String makes this component appear given the base URL (on launch)
    component:MathComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'cs', //the empty String makes this component appear given the base URL (on launch)
    component:CsComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'history', //the empty String makes this component appear given the base URL (on launch)
    component:HistoryComponent //so when I go to localhost:4200, we'll get this component
  },
   
   {
    path:'physics', //the empty String makes this component appear given the base URL (on launch)
    component:PhysicsComponent //so when I go to localhost:4200, we'll get this component
  },
  
  // {
  //   path:'quiz', //the empty String makes this component appear given the base URL (on launch)
  //   component:QuizComponent //so when I go to localhost:4200, we'll get this component
  //  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
