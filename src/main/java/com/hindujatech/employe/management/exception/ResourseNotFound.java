package com.hindujatech.employe.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourseNotFound extends RuntimeException{
    public ResourseNotFound(String message) {
        super(message);
    }
}
