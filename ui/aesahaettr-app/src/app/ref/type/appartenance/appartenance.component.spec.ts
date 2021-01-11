import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppartenanceComponent } from './appartenance.component';

describe('AppartenanceComponent', () => {
  let component: AppartenanceComponent;
  let fixture: ComponentFixture<AppartenanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppartenanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppartenanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
