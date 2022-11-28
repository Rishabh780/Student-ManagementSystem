package com.rishabh.service;

import java.util.List;

import com.rishabh.entity.Student;

public interface StudentService {
  List<Student> getAllStudents();
  	Student saveStudent(Student student);
  		Student getStudentById(Long id);
  	Student updateStudent(Student student);
  	void  delectStudentById(Long id);
}
