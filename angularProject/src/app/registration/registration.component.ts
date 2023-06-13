import { Component } from '@angular/core';
import { RegistrationService } from '../service/registration.service';
import { EmployeeDTO } from '../model/registration.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {

  message: string='';
  employeeDTO: EmployeeDTO = new EmployeeDTO;

  constructor( private registrationService: RegistrationService, private router: Router){}

  public postData(){
    this.registrationService.postData(this.employeeDTO).subscribe(res=>{
      if(res!=null){
        this.message ="data registration Succesfully"
      }
      else{
        this.router.navigate(['/login'])
      }
    })
  }
}
