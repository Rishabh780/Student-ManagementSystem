package com.rishabh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishabh.entity.Student;



public interface StudentRepository  extends JpaRepository<Student , Long>{
public List<Student> findAll();
}
