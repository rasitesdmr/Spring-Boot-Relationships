package com.example.springbootrelationships.mapper;

import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.model.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    StudentResponse studentToStudentResponse(Student student);
    List<StudentResponse> studentToStudentResponseList(List<Student>studentList);
}
