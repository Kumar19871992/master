package com.example.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*@ControllerAdvice
@RestController*/
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions (Exception ex, WebRequest request){
		 ExceptionResponse exceptionResponse =  new ExceptionResponse("FAILED", "numeric Exception");
		 return new ResponseEntity("Failed",HttpStatus.BAD_REQUEST);
	}
}
