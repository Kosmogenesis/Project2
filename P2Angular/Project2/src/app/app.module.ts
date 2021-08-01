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
// import { QuizComponent } from './components/quiz/quiz.component';




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
    CreatecardComponent
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
    AccordionModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
