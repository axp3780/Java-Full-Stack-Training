import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent {

  students=[
    {id:1, name:'arjun', email:'arjun@gmail.com' },
    {id:2, name:'Mike', email:'mike@gmail.com' },
    {id:3, name:'Monu', email:'Monu@gmail.com' }
  
  ];
 

}
