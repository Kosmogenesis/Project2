import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  //  user = this.service.getUser();

  constructor(private service:LoginService) { }

  ngOnInit(): void {
  }

}
