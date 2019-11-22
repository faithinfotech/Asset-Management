import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MasterCrudComponent } from './master-crud.component';

describe('MasterCrudComponent', () => {
  let component: MasterCrudComponent;
  let fixture: ComponentFixture<MasterCrudComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MasterCrudComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MasterCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
