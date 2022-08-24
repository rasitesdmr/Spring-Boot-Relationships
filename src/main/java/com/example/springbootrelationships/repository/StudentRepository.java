package com.example.springbootrelationships.repository;

import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> getByStudent_number(int student_number);


}

