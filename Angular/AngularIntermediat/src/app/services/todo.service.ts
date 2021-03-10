import { Injectable } from '@angular/core';
import { ToDo } from '../models/todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  todos:ToDo[] = []

  constructor() {}

  markTodoCompleted(todo:ToDo){
    todo.isComplete =true;
  }

  getCompletedTodo():ToDo[]{
    // return this.todos.filter((todo)=>{
    //     if(todo.isComplete){
    //       return true
    //     }else{
    //       return false;
    //     }
    // })
    return this.todos.filter(todo=>todo.isComplete)
  }

  getPendingTodo():ToDo[]{
    return this.todos.filter(todo=>!todo.isComplete)
  }


}
