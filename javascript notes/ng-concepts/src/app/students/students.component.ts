import { Component, OnInit } from '@angular/core';
import { Student, students } from '../students';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  mystudents = students;

  selectedStudent!: Student;

  constructor() { }

  ngOnInit(): void {
  }

  onSelect(student:Student):void{
    this.selectedStudent = student;

  }

}
