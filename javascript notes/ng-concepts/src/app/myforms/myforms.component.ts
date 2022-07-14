import { Component, OnInit } from '@angular/core';
import { StudentAlertsComponent } from '../student-alerts/student-alerts.component';
import { User } from '../students';

@Component({
  selector: 'app-myforms',
  templateUrl: './myforms.component.html',
  styleUrls: ['./myforms.component.css']
})
export class MyformsComponent implements OnInit {

  model: User = new User(101,"Tom");

  constructor() { }

  ngOnInit(): void {
  }


  newUser(){
    this.model = new User(111, "");
  }

  onSubmit(f:any){
    console.log(JSON.stringify(f.name));
  }

}
