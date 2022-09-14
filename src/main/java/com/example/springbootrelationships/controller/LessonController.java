package com.example.springbootrelationships.controller;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.enums.lessonEnum.TypeLanguage;
import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import com.example.springbootrelationships.mapper.LessonMapper;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    LessonService lessonService;
    @Autowired
    LessonMapper lessonMapper;

    @PostMapping("/create")
    public ResponseEntity<LessonResponse> createLesson(@RequestParam TypeLessonName typeLessonName,
                                                       TypeLanguage typeLanguage,
                                                       @RequestBody LessonDTO lessonDTO) {
        LessonResponse lessonResponse = lessonService.addLesson(lessonDTO,typeLessonName,typeLanguage);
        return new ResponseEntity<>(lessonResponse, HttpStatus.OK);

    }

    @GetMapping("/List")
    public ResponseEntity<List<LessonResponse>> getLesson() {
        List<LessonResponse> lessonList = lessonMapper.lessonDTOToLessonList(lessonService.findAllLesson());
        return ResponseEntity.ok(lessonList);
    }

}
