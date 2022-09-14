package com.example.springbootrelationships.dto.request;

import com.example.springbootrelationships.enums.lessonEnum.TypeLessonName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonDTO {

    @Enumerated(EnumType.STRING)
    private TypeLessonName lessonName;


}
