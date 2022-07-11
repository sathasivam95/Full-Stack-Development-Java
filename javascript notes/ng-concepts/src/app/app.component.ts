import { Component } from '@angular/core';
import { Student, students } from './students';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  
  title = 'CS258';
  mystudents = students;

myIntro(){
  alert("Hey This is working!");
}

onNotify(student: Student){
  alert('Yes you scored good grade, you will receive an email'+student.name);
}

}


