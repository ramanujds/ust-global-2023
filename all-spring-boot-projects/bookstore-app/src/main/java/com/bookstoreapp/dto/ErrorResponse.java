package com.bookstoreapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    // create field for status
    private int status;
    // create field for message
    private String message;
    // create field for timestamp
    private long timestamp;
    // create field for path
    private String path;

    // create field for error
    private String error;



}
