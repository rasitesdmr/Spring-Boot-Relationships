package com.example.springbootrelationships.controller;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.mapper.LessonMapper;
import com.example.springbootrelationships.model.Student;
import com.example.springbootrelationships.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    LessonMapper lessonMapper;

    @PostMapping("/create")
    public ResponseEntity<StudentResponse> createStudent(@RequestBody  StudentDTO studentDTO){
    StudentResponse studentResponse = studentService.addStudent(studentDTO);
    return new ResponseEntity<>(studentResponse , HttpStatus.OK);
    }
}
