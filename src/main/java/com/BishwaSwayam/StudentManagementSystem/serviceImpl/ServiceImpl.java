package com.BishwaSwayam.StudentManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BishwaSwayam.StudentManagementSystem.entity.Student;
import com.BishwaSwayam.StudentManagementSystem.service.StudentService;


@Service
public class ServiceImpl implements StudentService {

	@Autowired
	com.BishwaSwayam.StudentManagementSystem.repositry.Studentrepositry Studentrepositry;
	
	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list = Studentrepositry.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return Studentrepositry.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return Studentrepositry.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		Studentrepositry.deleteById(id);
		
	}
	
}
