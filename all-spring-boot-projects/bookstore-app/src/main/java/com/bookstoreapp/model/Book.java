package com.bookstoreapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;


public class Book {

   
    private int id;
   
  
    private String title;
    
    private String author;
   
    private int publicationYear;
 
    private long isbn;
   
    private double price;

}
