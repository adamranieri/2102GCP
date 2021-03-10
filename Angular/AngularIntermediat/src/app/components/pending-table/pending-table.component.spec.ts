import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PendingTableComponent } from './pending-table.component';

describe('PendingTableComponent', () => {
  let component: PendingTableComponent;
  let fixture: ComponentFixture<PendingTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PendingTableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PendingTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
