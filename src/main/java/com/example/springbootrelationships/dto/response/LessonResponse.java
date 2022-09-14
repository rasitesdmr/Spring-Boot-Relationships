package com.example.springbootrelationships.dto.response;

import com.example.springbootrelationships.enums.lessonEnum.TypeLanguage;
import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import com.example.springbootrelationships.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonResponse {

    @Enumerated(EnumType.STRING)
    private TypeLessonName lessonName;

    @Enumerated(EnumType.STRING)
    private TypeLanguage course_language;

  //  private List<Student> school;

}
