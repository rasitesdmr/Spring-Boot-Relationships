package com.example.springbootrelationships.controller;

import com.example.springbootrelationships.dto.request.SchoolDTO;
import com.example.springbootrelationships.dto.response.SchoolResponse;
import com.example.springbootrelationships.enums.schoolEnum.TypeSchool;
import com.example.springbootrelationships.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @PostMapping("/create")
    public ResponseEntity<SchoolResponse> createSchool(@RequestParam TypeSchool typeSchool,@RequestBody SchoolDTO schoolDTO) {
        SchoolResponse schoolResponse = schoolService.addSchool(schoolDTO,typeSchool);
        return new ResponseEntity<>(schoolResponse, HttpStatus.OK);
    }
}
