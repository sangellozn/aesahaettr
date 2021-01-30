import { TestBed } from '@angular/core/testing';

import { LocalisationsService } from './localisations.service';

describe('LocalisationsService', () => {
  let service: LocalisationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LocalisationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
