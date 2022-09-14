package com.example.springbootrelationships.mapper;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.model.Student;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface StudentMapper {

    StudentResponse studentToStudentResponse(Student student);

    Student studentDTOToStudent(StudentDTO studentDTO);

    List<StudentResponse> studentDTOToStudentList(List<Student> studentDTOList);
}
