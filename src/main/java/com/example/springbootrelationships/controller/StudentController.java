package com.example.springbootrelationships.controller;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.mapper.LessonMapper;
import com.example.springbootrelationships.mapper.StudentMapper;
import com.example.springbootrelationships.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    LessonMapper lessonMapper;
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/List")
    public ResponseEntity<List<StudentResponse>> getStudent() {
        List<StudentResponse> studentList = studentMapper.studentDTOToStudentList(studentService.findAllStudent());
        return ResponseEntity.ok(studentList);
    }
    @PostMapping("/create")
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentDTO studentDTO) {
        StudentResponse studentResponse = studentService.saveStudent(studentDTO);
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }



}
