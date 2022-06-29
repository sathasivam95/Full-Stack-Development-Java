package com.example.demo;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyStudentController {
	
	private final StudentRepository studentRepository;
	
	MyStudentController(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}
	
	// Fetch the records
	@GetMapping("/students")
	List<Student>getAll(){
		return studentRepository.findAll();
	}
	
//	// Get the Names, Total, Avg, Grade
//	@GetMapping("/student/grades")
//	List<Student>viewGrades(){
//	
//	}
		
}
	


