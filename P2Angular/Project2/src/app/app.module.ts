import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from '../app/components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { ButtonsModule } from 'ngx-bootstrap/buttons';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { AuthModule } from './auth/auth.module';
import { HttpClientModule } from '@angular/common/http';


import { FormsModule } from '@angular/forms';
import { HomeComponent } from './components/home/home.component';
import { LogoutComponent } from './components/logout/logout.component';
import { ViewCardsComponent } from './components/view-cards/view-cards.component';
import { TakeATestComponent } from './components/take-a-test/take-a-test.component';
import { AccordionModule } from 'ngx-bootstrap/accordion';
import { CreatecardComponent } from './components/createcard/createcard.component';
import { GreenComponent } from './components/green/green.component';
import { YellowComponent } from './components/yellow/yellow.component';
import { RedComponent } from './components/red/red.component';
// import { QuizComponent } from './components/quiz/quiz.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatChipsModule } from '@angular/material/chips';
import { LoginfailedComponent } from './components/loginfailed/loginfailed.component';
import { SignupfailedComponent } from './components/signupfailed/signupfailed.component';
import { StatusroomComponent } from './components/statusroom/statusroom.component';
import { SubjectroomComponent } from './components/subjectroom/subjectroom.component';
import { MathComponent } from './components/math/math.component';
import { HistoryComponent } from './components/history/history.component';
import { CsComponent } from './components/cs/cs.component';
import { PhysicsComponent } from './components/physics/physics.component';




@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    NavbarComponent,
    LoginComponent,
    SignupComponent,

    AboutusComponent,
    HomeComponent,
    LogoutComponent,
    ViewCardsComponent,
    TakeATestComponent,
    CreatecardComponent,
    GreenComponent,
    YellowComponent,
    RedComponent,
    LoginfailedComponent,
    SignupfailedComponent,
    StatusroomComponent,
    SubjectroomComponent,
    MathComponent,
    HistoryComponent,
    CsComponent,
    PhysicsComponent
    // QuizComponent,
    
   
    
    
   

    
    // LoginPageComponent,
    // LoginBoxComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ButtonsModule,
    BsDropdownModule,
    AuthModule,
    HttpClientModule,
    FormsModule,
    AccordionModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatChipsModule,
    MatInputModule,
    MatSelectModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
