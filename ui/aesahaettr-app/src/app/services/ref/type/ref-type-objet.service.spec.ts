import { TestBed } from '@angular/core/testing';

import { RefTypeObjetService } from './ref-type-objet.service';

describe('RefTypeObjetService', () => {
  let service: RefTypeObjetService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RefTypeObjetService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
