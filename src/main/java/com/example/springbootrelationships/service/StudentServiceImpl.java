package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.exception.StudentNumberAlreadyExistsException;
import com.example.springbootrelationships.mapper.SchoolMapper;
import com.example.springbootrelationships.mapper.StudentMapper;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.model.School;
import com.example.springbootrelationships.model.Student;
import com.example.springbootrelationships.repository.LessonRepository;
import com.example.springbootrelationships.repository.SchoolRepository;
import com.example.springbootrelationships.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    LessonService lessonService;
    @Autowired
    SchoolService schoolService;


    @Override
    public StudentResponse addStudent(StudentDTO studentDTO) {
        System.out.println();
        Student student = studentMapper.studentDTOToStudent(studentDTO);
        List<Lesson> lessonList = new ArrayList<>();
        for (Long lessonId : studentDTO.getLessonIdList()) {
            Lesson lesson = lessonService.getLessonId(lessonId);
            lessonList.add(lesson);
        }
        student.setLessonList(lessonList);
        School school = schoolService.getSchoolId(studentDTO.getSchool_id());
        student.setSchool(school);

        return studentMapper.studentToStudentResponse(studentRepository.save(student));
    }
}


