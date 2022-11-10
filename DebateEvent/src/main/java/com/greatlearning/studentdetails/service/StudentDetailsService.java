package com.greatlearning.studentdetails.service;

import java.util.List;

import com.greatlearning.studentdetails.entity.Student;

public interface StudentDetailsService {

	public Student getStudentById(int id);

	public List<Student> getAllStudents();

	public Student saveStudent(Student student);

	public Student delete(int id);
}
