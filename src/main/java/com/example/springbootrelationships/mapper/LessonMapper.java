package com.example.springbootrelationships.mapper;

import com.example.springbootrelationships.dto.request.LessonDTO;
import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.dto.response.StudentResponse;
import com.example.springbootrelationships.model.Lesson;
import com.example.springbootrelationships.model.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LessonMapper {

    LessonResponse lessonToLessonResponse(Lesson lesson);

    Lesson lessonDTOToLesson(LessonDTO lessonDTO);

    List<LessonResponse> lessonDTOToLessonList(List<Lesson> lessonDTOList);
}
