import { Component, OnInit } from '@angular/core';
import { ToDo } from 'src/app/models/todo';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-todo-creation-page',
  templateUrl: './todo-creation-page.component.html',
  styleUrls: ['./todo-creation-page.component.css']
})
export class TodoCreationPageComponent implements OnInit {

  description:string =''
  priority:number = 0

  constructor(private toDoService:TodoService) { }

  ngOnInit(): void {
  }

  createToDo(){
    const todo:ToDo = new ToDo(this.description,this.priority,false);
    this.toDoService.todos.push(todo); // add a todo the todos list in the service
    alert("Succesfully created a new ToDo")
    console.log(this.toDoService.todos)
  }

}
