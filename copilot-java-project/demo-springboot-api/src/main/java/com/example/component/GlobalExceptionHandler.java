package com.example.component;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*
 * global exception handler for springboot app
 * 
 */
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {

    //create a global exception handler for a specific exception and a specific http status code and a specific message and a specific error code
    public void handleException(Exception e, HttpStatus httpStatus, String message, String errorCode) {
        //create a response entity with the exception and the http status code and the message and the error code
        //return the response entity
        //    return ResponseEntity.status(httpStatus).body(new ExceptionResponse(e, httpStatus, message, errorCode));
    }

    public ResponseEntity handleException(Exception e, HttpStatus httpStatus, String message) {
        //create a response entity with the exception and the http status code and the message
        //return the response entity
        return ResponseEntity.status(httpStatus).body("Unknown error, error is " + message);//manual created 
    }
}
