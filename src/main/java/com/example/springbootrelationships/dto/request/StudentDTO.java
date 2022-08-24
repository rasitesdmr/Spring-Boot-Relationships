package com.example.springbootrelationships.dto.request;

import com.example.springbootrelationships.model.Lesson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    @NotBlank(message = "first_name boş bırakılmaz")
    private String first_name;
    @NotBlank(message = "last_name boş bırakılmaz")
    private String last_name;
    @NotBlank(message = "student_number boş bırakılmaz")
    private int student_number;

    @NotBlank
    private Long school_id;
    @NotBlank
    private List<Long> lessonIdList;


}
