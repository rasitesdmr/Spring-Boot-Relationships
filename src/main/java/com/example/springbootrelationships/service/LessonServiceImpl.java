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
        Lesson lesson = new Lesson();
        lesson.setLesson_name(lessonDTO.getLesson_name());
        lesson.setLesson_code(lessonDTO.getLesson_code());
        lesson.setCourse_language(lessonDTO.getCourse_language());
        lessonRepository.save(lesson);
        //LessonResponse lessonResponse= new LessonResponse();
        //lessonResponse.setLesson_name(lesson.getLesson_name());
        //lessonResponse.setLesson_code(lesson.getLesson_code());
        //lessonResponse.setCourse_language(lesson.getCourse_language());
        //return lessonResponse;
        return lessonMapper.lessonToLessonResponse(lesson);
    }

    @Override
    public Lesson getLessonId(Long lessonId) {
        return lessonRepository.
                findById(lessonId).
                orElseThrow(()-> new IllegalArgumentException(lessonId + "hata"));
    }

}
