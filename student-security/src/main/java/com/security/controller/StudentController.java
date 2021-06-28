package com.security.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.Student;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
	
	private static final List<Student> students = Arrays.asList(
	new Student(1, "Vj"),new Student(3, "Max"),new Student(2, "Dj")); 
	
	@GetMapping(path = "{studentId}")
	public Student getStudent(@PathVariable("studentId") Integer studentId)
	{
		return new Student();
	}
}
