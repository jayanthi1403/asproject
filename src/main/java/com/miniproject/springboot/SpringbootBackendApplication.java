package com.miniproject.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.miniproject.springboot.model.Student;
import com.miniproject.springboot.repository.StudentRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws  Exception
	{
		this.studentRepository.save(new Student("Jayanthi","Ravindran","jayanthi99@gamil.com"));
		this.studentRepository.save(new Student("Narmadha","Subramanian","narmadha9299@gamil.com"));
		this.studentRepository.save(new Student("Harini","Pandiyarajhen","harinipandi@gamil.com"));
	}
	
}
