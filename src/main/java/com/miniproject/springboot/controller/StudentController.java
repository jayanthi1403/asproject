package com.miniproject.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.springboot.model.Student;
import com.miniproject.springboot.repository.StudentRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")
public class StudentController
{
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("students")
	public List<Student> getStudents()
	{
		return this.studentRepository.findAll();
		
	}

}
