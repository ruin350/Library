package com.korit.library.wep.advice;

import com.korit.library.execption.CustomValidationException;
import com.korit.library.wep.dto.CMRespDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> validationError(CustomValidationException e){
        return ResponseEntity.badRequest().body(new CMRespDto<>("Validation Error" , e.getErrorMap()));
    }
}
