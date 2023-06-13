import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  extra:String = 'Arjun';
  data = 10;

 

sum:any;


  public add(num1:any, num2:any){
    this.sum = num1+num2;
    console.log(this.sum);
  }
resultMult:any;
  public multiply(num1:any, num2:any){
    this.resultMult = num1*num2;

  }
myString:any
  public test(total:string){
    this.myString = total;
  }

  addedValue:any;
  n1:any;
  n2:any;
  public addInputValue(){
    this.addedValue = this.n1 + this.n2;
    console.log(this.addedValue);
  }
  students=[
    {id:1, name:'arjun', email:'arjun@gmail.com' },
    {id:2, name:'Mike', email:'mike@gmail.com' },
    {id:3, name:'Monu', email:'Monu@gmail.com' }
  
  ];
  status:any;
  
  constructor(private router: Router){}

  Username:any;
  Password:any;
  public showData(){
    if (this.Username==='Arjun' && this.Password==='test@123'){
      this.router.navigate(['/myComponent']);
   
    }
    else{
      this.status='Username or Password is Incorrect';
    }
  }

 


  

}

