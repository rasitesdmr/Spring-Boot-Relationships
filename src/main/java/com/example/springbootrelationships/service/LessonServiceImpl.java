package com.example.springbootrelationships.service;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.enums.lessonEnum.TypeLanguage;
import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import com.example.springbootrelationships.exception.LessonNameAlreadyExistsException;
import com.example.springbootrelationships.mapper.LessonMapper;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    LessonMapper lessonMapper;

    @Override
    public LessonResponse addLesson(LessonDTO lessonDTO,
                                    TypeLessonName typeLessonName,
                                    TypeLanguage typeLanguage) {

        if (lessonRepository.findByLessonName(lessonDTO.getLessonName()).isPresent()) {
            throw new LessonNameAlreadyExistsException();
        }
        Lesson lesson = lessonMapper.lessonDTOToLesson(lessonDTO);
        lesson.setLessonName(typeLessonName);
        lesson.setCourse_language(typeLanguage);

        lessonRepository.save(lesson);
        return lessonMapper.lessonToLessonResponse(lesson);
    }



    @Override
    public Lesson getLessonId(Long lessonId) {
        return lessonRepository.
                findById(lessonId).
                orElseThrow(() -> new IllegalArgumentException(lessonId + "hata"));
    }

    @Override
    public List<Lesson> findAllLesson() {
        return lessonRepository.findAll();
    }


}
