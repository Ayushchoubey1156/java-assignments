import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookContainerComponent } from './book-container/book-container.component';
import { BookComponent } from './book/book.component';

const routes: Routes = [
  {
    path:"books",
    component:BookContainerComponent,
    children:[
      {
        path:"book",
        component:BookComponent
      }
    ]
  },
  {
    path:"",
    redirectTo:"/books",
    pathMatch:"full"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
