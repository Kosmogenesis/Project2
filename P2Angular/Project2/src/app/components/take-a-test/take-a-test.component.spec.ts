import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TakeATestComponent } from './take-a-test.component';

describe('TakeATestComponent', () => {
  let component: TakeATestComponent;
  let fixture: ComponentFixture<TakeATestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TakeATestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TakeATestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
