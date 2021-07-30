import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-take-a-test',
  templateUrl: './take-a-test.component.html',
  styleUrls: ['./take-a-test.component.css']
})
export class TakeATestComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
