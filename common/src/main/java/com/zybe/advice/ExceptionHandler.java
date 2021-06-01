package com.zybe.advice;

import com.zybe.exception.CustomException;
import com.zybe.pojo.ReturnData;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
    private ResponseEntity<String> exceptionHandler(CustomException e) {
        return ResponseEntity.status(e.getCode()).body(e.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(BindException.class)
    private ResponseEntity<ReturnData> exceptionHandler(BindException e) {
        String message = "";
        List<ObjectError> allErrors = e.getAllErrors();
        for (ObjectError objectError : allErrors) {
            FieldError fieldError = (FieldError) objectError;
            message += fieldError.getField() + objectError.getDefaultMessage() + "|";
        }
        return ResponseEntity.badRequest().body(new ReturnData(400,message));
    }
}
