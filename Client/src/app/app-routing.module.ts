import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PostEmployeeComponent } from './components/post-employee/post-employee.component';
import { GetAllEmployeeComponent } from './components/get-all-employee/get-all-employee.component';
import { UpdateEmployeeComponent } from './components/update-employee/update-employee.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:'employee', component: PostEmployeeComponent},
  {path:"", component: GetAllEmployeeComponent},
  {path:"employee/:id", component:UpdateEmployeeComponent},
  {path:"login", component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
