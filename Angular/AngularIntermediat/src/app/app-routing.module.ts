import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TodoCreationPageComponent } from './components/todo-creation-page/todo-creation-page.component';
import { TodoDisplayPageComponent } from './components/todo-display-page/todo-display-page.component';

const routes: Routes = [
  {path:"creation",component:TodoCreationPageComponent},
  {path:"display",component:TodoDisplayPageComponent},
  {path:"**",component:TodoCreationPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
