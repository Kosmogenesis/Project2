import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-statusroom',
  templateUrl: './statusroom.component.html',
  styleUrls: ['./statusroom.component.css']
})
export class StatusroomComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
   this.router.navigate(['status-room'])
  }

}
