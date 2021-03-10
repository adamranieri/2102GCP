import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoDisplayPageComponent } from './todo-display-page.component';

describe('TodoDisplayPageComponent', () => {
  let component: TodoDisplayPageComponent;
  let fixture: ComponentFixture<TodoDisplayPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodoDisplayPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodoDisplayPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
