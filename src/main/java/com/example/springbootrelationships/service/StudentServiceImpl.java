package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.StudentDTO;
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
    SchoolRepository schoolRepository;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    LessonRepository lessonRepository;

    @Override
    public Student addStudent(StudentDTO studentDTO) {

        Student student = new Student();
        student.setFirst_name(studentDTO.getFirst_name());
        student.setLast_name(studentDTO.getLast_name());
        student.setStudent_number(studentDTO.getStudent_number());

        //TODO validation uygulanacak .
        if (studentDTO.getSchool_id() == null) {
            throw new IllegalArgumentException("öğrencinin school_id 'sine ihtiyacı var.");
        }
        School school = schoolRepository.findById(studentDTO.getSchool_id()).orElseThrow(() -> new IllegalArgumentException(
                studentDTO.getSchool_id() + " could not be found"));
        student.setSchool(school);
        //studentMapper.studentToStudentResponse(student);
        List<Lesson> lessonList = new ArrayList<>();
        studentDTO.getLessonList().forEach(lesson -> {
            lessonRepository.findById(lesson.getLesson_id()).orElseThrow(()->new IllegalArgumentException(
                    lesson.getLesson_id() + " could not be found"));
            lessonList.add(lesson);
        });

        student.setLessonList(lessonList);

        return studentRepository.save(student);


    }
}
