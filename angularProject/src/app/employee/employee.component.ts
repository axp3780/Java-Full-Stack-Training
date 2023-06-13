import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})

 
export class EmployeeComponent {
  constructor(private employeeService:EmployeeService){}

  employeeList:any;
  public getData(){
    this.employeeService.getData().subscribe(res=>{this.employeeList=res;})
  }
}
