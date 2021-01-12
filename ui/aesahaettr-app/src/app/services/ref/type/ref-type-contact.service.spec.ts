import { TestBed } from '@angular/core/testing';

import { RefTypeContactService } from './ref-type-contact.service';

describe('RefTypeContactService', () => {
  let service: RefTypeContactService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RefTypeContactService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
