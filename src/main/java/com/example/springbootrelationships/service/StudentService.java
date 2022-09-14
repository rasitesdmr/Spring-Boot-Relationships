package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentResponse saveStudent(StudentDTO studentDTO);
    List<Student> findAllStudent();

}
