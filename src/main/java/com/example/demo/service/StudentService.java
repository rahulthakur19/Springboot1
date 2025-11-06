package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {

    public void addStudent(Student student) {
       System.out.println("Student added: " + student);
    }

}
