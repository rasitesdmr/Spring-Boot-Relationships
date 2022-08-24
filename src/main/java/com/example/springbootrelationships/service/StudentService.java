package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student addStudent(StudentDTO studentDTO);

}
