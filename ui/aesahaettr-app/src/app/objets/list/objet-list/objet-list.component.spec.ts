import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObjetListComponent } from './objet-list.component';

describe('ObjetsListComponent', () => {
  let component: ObjetListComponent;
  let fixture: ComponentFixture<ObjetListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObjetListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObjetListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
