import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  urls = 'http://localhost:999/api/v1/employees'

  constructor( private http:HttpClient) { }

  public getData(){
    return this.http.get(this.urls);
  }
}
