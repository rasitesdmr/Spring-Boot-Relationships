package com.example.springbootrelationships.mapper;

import com.example.springbootrelationships.dto.response.LessonResponse;
import com.example.springbootrelationships.model.Lesson;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LessonMapper {

    LessonResponse lessonToLessonResponse(Lesson lesson);

    List<Lesson> lessonToLessonResponseList(List<Lesson> lessonList);

}
