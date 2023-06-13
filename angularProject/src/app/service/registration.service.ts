import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { EmployeeDTO } from '../model/registration.model';


@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  urls = 'http://localhost:999/api/v1/employees';
  constructor(private httpClient:HttpClient) {}
    
  
  public postData(employeeDTO: EmployeeDTO) {
    return this.httpClient.post(this.urls, employeeDTO);
  }
  }
