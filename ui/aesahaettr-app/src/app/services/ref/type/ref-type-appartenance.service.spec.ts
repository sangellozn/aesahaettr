import { TestBed } from '@angular/core/testing';

import { RefTypeAppartenanceService } from './ref-type-appartenance.service';

describe('RefTypeAppartenanceService', () => {
  let service: RefTypeAppartenanceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RefTypeAppartenanceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
