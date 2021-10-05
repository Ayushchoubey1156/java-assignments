import { TestBed } from '@angular/core/testing';

import { BookshelfserviceService } from './bookshelfservice.service';

describe('BookshelfserviceService', () => {
  let service: BookshelfserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BookshelfserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
