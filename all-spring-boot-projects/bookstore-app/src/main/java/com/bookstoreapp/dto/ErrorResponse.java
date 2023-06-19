package com.bookstoreapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ErrorResponse {
   
    private int status;
   
    private String message;
   
    private long timestamp;
  
    private String path;

  
    private String error;



}
