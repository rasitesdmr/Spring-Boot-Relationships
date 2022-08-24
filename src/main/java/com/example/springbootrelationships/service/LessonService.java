package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.model.Lesson;
import org.springframework.stereotype.Service;

@Service
public interface LessonService {
    LessonResponse addLesson(LessonDTO lessonDTO);

    Lesson getLessonId(Long lessonId);


}
