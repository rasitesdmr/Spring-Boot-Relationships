package com.example.springbootrelationships.controller;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.service.LessonService;
import com.example.springbootrelationships.service.LessonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    LessonService lessonService;


    @PostMapping("/create")
    public LessonResponse createLesson(@RequestBody LessonDTO lessonDTO) {
        return lessonService.addLesson(lessonDTO);
    }
}
