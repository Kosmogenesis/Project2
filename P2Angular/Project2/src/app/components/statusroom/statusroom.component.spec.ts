import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StatusroomComponent } from './statusroom.component';

describe('StatusroomComponent', () => {
  let component: StatusroomComponent;
  let fixture: ComponentFixture<StatusroomComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StatusroomComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StatusroomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
