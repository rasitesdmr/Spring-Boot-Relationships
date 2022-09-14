package com.example.springbootrelationships.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED, reason = "Error : Okul zaten seçildi !")
public class SchoolNameAlreadyExistsException extends RuntimeException {

}
