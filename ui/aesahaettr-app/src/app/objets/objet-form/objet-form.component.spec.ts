import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObjetFormComponent } from './objet-form.component';

describe('ObjetFormComponent', () => {
  let component: ObjetFormComponent;
  let fixture: ComponentFixture<ObjetFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObjetFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObjetFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
