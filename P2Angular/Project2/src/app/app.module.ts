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


// import { LoginPageComponent } from './components/login-page/login-page.component';
// import { LoginBoxComponent } from './components/login-box/login-box.component';









@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    NavbarComponent,
    LoginComponent,
    SignupComponent,

    AboutusComponent,
    HomeComponent,
    LogoutComponent
    
    
   

    
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

    FormsModule

    //LoginBoxComponent

    


  
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
