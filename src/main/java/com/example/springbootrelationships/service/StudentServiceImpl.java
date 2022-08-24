package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.StudentDTO;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.exception.StudentNumberAlreadyExistsException;
import com.example.springbootrelationships.mapper.StudentMapper;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.model.School;
import com.example.springbootrelationships.model.Student;
import com.example.springbootrelationships.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    /*    // TODO : Bakılacak
        Optional<Student> student1 = studentRepository.student_number(studentDTO.getStudent_number());
        if (student1.isPresent()) {
            throw new StudentNumberAlreadyExistsException();
        }
    */
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


/*


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

*/

