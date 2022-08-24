package com.example.springbootrelationships.dto.response;

import com.example.springbootrelationships.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse {

    private String school_name;

    private String type_of_school;

    private List<Student> studentList;
}
