package com.ust.customerapp.controller;

import java.time.LocalDateTime;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ust.customerapp.dto.ErrorResponse;
import com.ust.customerapp.exception.CustomerNotFoundException;

@RestControllerAdvice
public class CustomerApiErrorController {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleCustomerNotFoundError(CustomerNotFoundException ex, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		ErrorResponse body = new ErrorResponse(LocalDateTime.now(), 
								status.value(), status.getReasonPhrase(),
												ex.getMessage(),request.getRequestURI() );
		return ResponseEntity.status(status).body(body);
	}
	
	// DuplicateCustomerException
	
	
}
