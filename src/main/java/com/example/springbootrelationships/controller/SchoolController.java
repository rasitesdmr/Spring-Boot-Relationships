package com.example.springbootrelationships.controller;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.service.SchoolService;
import com.example.springbootrelationships.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @PostMapping("/create")
    public ResponseEntity<SchoolResponse> createSchool(@RequestBody SchoolDTO schoolDTO) {
        SchoolResponse schoolResponse = schoolService.addSchool(schoolDTO);
        return new ResponseEntity<>(schoolResponse, HttpStatus.OK);
    }
}
