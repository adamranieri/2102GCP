import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoCreationPageComponent } from './todo-creation-page.component';

describe('TodoCreationPageComponent', () => {
  let component: TodoCreationPageComponent;
  let fixture: ComponentFixture<TodoCreationPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodoCreationPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodoCreationPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
