package com.greatlearning.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentdetails.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
