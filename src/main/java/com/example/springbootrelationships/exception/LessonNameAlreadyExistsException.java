package com.example.springbootrelationships.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED, reason = "Error : Ders zaten seçildi !")
public class LessonNameAlreadyExistsException extends RuntimeException {
}
