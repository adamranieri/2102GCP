import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoCreationPageComponent } from './components/todo-creation-page/todo-creation-page.component';
import { TodoDisplayPageComponent } from './components/todo-display-page/todo-display-page.component';
import {FormsModule} from '@angular/forms';
import { PendingTableComponent } from './components/pending-table/pending-table.component'
import { TodoService } from './services/todo.service';
import { PriorityPipe } from './pipes/priority.pipe';
import { CompletedTableComponent } from './components/completed-table/completed-table.component';


@NgModule({
  declarations: [
    AppComponent,
    TodoCreationPageComponent,
    TodoDisplayPageComponent,
    PendingTableComponent,
    PriorityPipe,
    CompletedTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [TodoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
