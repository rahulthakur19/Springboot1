package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentRepo {

     public void save(Student s)
     {
        System.out.println("Student saved:") ;
     }
     public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
}
}