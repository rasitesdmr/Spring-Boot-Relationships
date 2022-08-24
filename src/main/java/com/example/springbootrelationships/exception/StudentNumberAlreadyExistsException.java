package com.example.springbootrelationships.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = "Öğrenci numarasına zaten var ")
public class StudentNumberAlreadyExistsException extends RuntimeException{
}