import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SubjectroomComponent } from './subjectroom.component';

describe('SubjectroomComponent', () => {
  let component: SubjectroomComponent;
  let fixture: ComponentFixture<SubjectroomComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SubjectroomComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SubjectroomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
