import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AssociateListComponent } from './components/associatelist.component';
import { ContactInformationComponent } from './components/contactinfo.component';
import { EmployeeComponent } from './components/employee.component';
import { IntroComponent } from './components/intro.component';
import { FormsModule } from '@angular/forms';


// Every Angular Application has only 1 app.module
// Think of the app.module is a table of contents
// whenever you make a component you have to add it in the app.module

@NgModule({
  declarations: [
    AppComponent,
    IntroComponent,
    EmployeeComponent,
    ContactInformationComponent,
    AssociateListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
