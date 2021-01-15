import { TestBed } from '@angular/core/testing';

import { RefTypeRelationService } from './ref-type-relation.service';

describe('RefTypeRelationService', () => {
  let service: RefTypeRelationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RefTypeRelationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
