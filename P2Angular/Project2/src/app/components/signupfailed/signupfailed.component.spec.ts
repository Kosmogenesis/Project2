import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupfailedComponent } from './signupfailed.component';

describe('SignupfailedComponent', () => {
  let component: SignupfailedComponent;
  let fixture: ComponentFixture<SignupfailedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SignupfailedComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SignupfailedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
