package com.example.demo;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyStudentController {
	
	private final StudentRepository studentRepository;
	
	MyStudentController(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}
	
	
	@GetMapping("/students")
	List<Student>getAll(){
		return studentRepository.findAll();
	}
	
	

}


