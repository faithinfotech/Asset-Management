import { TestBed } from '@angular/core/testing';

import { AssetmasterService } from './assetmaster.service';

describe('AssetmasterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AssetmasterService = TestBed.get(AssetmasterService);
    expect(service).toBeTruthy();
  });
});
