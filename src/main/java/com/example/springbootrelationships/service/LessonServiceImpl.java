package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.mapper.LessonMapper;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    LessonMapper lessonMapper;

    @Override
    public LessonResponse addLesson(LessonDTO lessonDTO) {
        Lesson lesson = lessonMapper.lessonDTOToLesson(lessonDTO);
        lessonRepository.save(lesson);
        return lessonMapper.lessonToLessonResponse(lesson);
    }

    @Override
    public Lesson getLessonId(Long lessonId) {
        return lessonRepository.
                findById(lessonId).
                orElseThrow(()-> new IllegalArgumentException(lessonId + "hata"));
    }

}
