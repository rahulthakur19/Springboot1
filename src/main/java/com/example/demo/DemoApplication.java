package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setRollNo(1);
		student.setName("John Doe");
		student.setMarks(95);
		
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);
	}

}
