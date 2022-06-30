package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGradeController {
	
	@RequestMapping("/students/{name}")
	@ResponseBody
	String helloStudent(@PathVariable String name) {
		return "Hello " +name + " Welcome to my Spring App!";

	}
	
	@RequestMapping("/calculator/{a}/{b}")
	@ResponseBody
	String calculator(@PathVariable float a, @PathVariable float b) {
		float sum = a+b;
		float sub = a-b;
		float div = a/b;
		float mul = a*b;
		return "Addition = " + sum + '\n' +
				" Subtraction = " + sub + '\n' +
				" Division = " + div + '\n' +
				" Multiplication = " + mul;

	}
	
	@RequestMapping("/student/{name}/{grade}")
	@ResponseBody
	String calculator(@PathVariable String name, @PathVariable float grade) {
		
		if(grade <= 100 && grade >= 90) {
	        return ("Hi " + name + " Your grade is A");
	    }
		else if(grade <= 90 && grade >= 80) {
	        return ("Hi " + name + " Your grade is B");
	    }
		else if(grade <= 80 && grade >= 70) {
			return ("Hi " + name + " Your grade is C");
		}
		else if(grade <= 70 && grade >= 50) {
			return ("Hi " + name + " Your grade is D");
		}
		else {
			return ("Hi " + name + " You have failed");
		}
		
   }
	

}
