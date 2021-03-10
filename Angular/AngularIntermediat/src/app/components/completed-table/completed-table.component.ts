import { Component, OnInit } from '@angular/core';
import { ToDo } from 'src/app/models/todo';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-completed-table',
  templateUrl: './completed-table.component.html',
  styleUrls: ['./completed-table.component.css']
})
export class CompletedTableComponent implements OnInit {

  constructor(private todoService:TodoService) { }

  todos:ToDo[] =[];

  // gets called whenever a component is rendered to the screen for the first time
  ngOnInit(): void {
    this.todos= this.todoService.todos
  }


}
