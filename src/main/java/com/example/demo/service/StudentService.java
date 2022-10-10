package com.example.demo.service;
import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	 
	 public Student getStudentById(int id);
	 
	 public void addStudent(Student student);
	 
	 public void deleteStudent(int id);
}
