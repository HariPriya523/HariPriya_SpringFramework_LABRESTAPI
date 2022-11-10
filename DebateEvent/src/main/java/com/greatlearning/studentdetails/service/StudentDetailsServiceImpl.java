package com.greatlearning.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentdetails.entity.Student;
import com.greatlearning.studentdetails.repository.StudentRepository;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student delete(int id) {
		Student student = getStudentById(id);
		studentRepository.delete(student);
		return student;
	}

}
