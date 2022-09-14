package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.enums.lessonEnum.TypeLanguage;
import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import com.example.springbootrelationships.model.Lesson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {

    LessonResponse addLesson(LessonDTO lessonDTO,
                             TypeLessonName typeLessonName,
                             TypeLanguage typeLanguage);



    Lesson getLessonId(Long lessonId);

    List<Lesson> findAllLesson();


}
