package com.BishwaSwayam.StudentManagementSystem.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.BishwaSwayam.StudentManagementSystem.entity.Student;
@Repository
public interface Studentrepositry extends JpaRepository<Student, Integer> {

}
