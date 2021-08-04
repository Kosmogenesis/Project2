import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-subjectroom',
  templateUrl: './subjectroom.component.html',
  styleUrls: ['./subjectroom.component.css']
})
export class SubjectroomComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
     this.router.navigate(['/subject-room'])
  }

}
