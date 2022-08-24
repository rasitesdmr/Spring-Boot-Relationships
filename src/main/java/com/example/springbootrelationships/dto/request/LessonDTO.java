package com.example.springbootrelationships.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonDTO {

    private String lesson_name;

    private String lesson_code;

    private String course_language;
}
