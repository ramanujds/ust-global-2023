package com.bookstoreapp.exception;

import com.bookstoreapp.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;

@RestControllerAdvice
public class BookstoreErrorHandler {

    // create a method to handle BookNotFoundException

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleBookNotFoundException(BookNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(404);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath("/books");
        errorResponse.setError("Not Found");
        return ResponseEntity.status(404).body(errorResponse);

    }

    // create a method to handle BookAlreadyExistsException

    @ExceptionHandler(BookAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleBookAlreadyExistsException(BookAlreadyExistsException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(409);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath("/books");
        errorResponse.setError("Conflict");
        return ResponseEntity.status(409).body(errorResponse);

    }

    // create a method to validate the request body
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(ValidationException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(400);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath("/books");
        errorResponse.setError("Bad Request");
        return ResponseEntity.status(400).body(errorResponse);

    }



    @ExceptionHandler(Exception.class)
    // create a method to handle Exception
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(500);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setPath("/books");
        errorResponse.setError("Internal Server Error");
        return ResponseEntity.status(500).body(errorResponse);

    }



}
