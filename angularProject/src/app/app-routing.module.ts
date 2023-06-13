import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { EmployeeComponent } from './employee/employee.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [
  {
    path: 'login', 
    component:LoginComponent
  },{
    path: '', component: LoginComponent
  }
  ,{
    path: 'myComponent', component: MyComponentComponent
  },
  {
    path: 'employeeComponent', component: EmployeeComponent
  },
  {
    path: 'registrationComponent', component: RegistrationComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
