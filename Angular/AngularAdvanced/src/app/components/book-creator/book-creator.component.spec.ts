import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookCreatorComponent } from './book-creator.component';

describe('BookCreatorComponent', () => {
  let component: BookCreatorComponent;
  let fixture: ComponentFixture<BookCreatorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookCreatorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookCreatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
