import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocalisationListComponent } from './localisation-list.component';

describe('LocalisationListComponent', () => {
  let component: LocalisationListComponent;
  let fixture: ComponentFixture<LocalisationListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LocalisationListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LocalisationListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
