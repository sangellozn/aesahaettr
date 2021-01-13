import { TestBed } from '@angular/core/testing';

import { RefTypeLocalisationService } from './ref-type-localisation.service';

describe('RefTypeLocalisationService', () => {
  let service: RefTypeLocalisationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RefTypeLocalisationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
