package com.bookstoreapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
@Entity
public class Book {

    // create fields id title author publications isbn and price
    @Id
    private int id;
    // The title should not be empty and should not exceed 100 characters
    @NotBlank(message = "Title is mandatory")
    @Size(max = 100, message = "Title should not exceed 100 characters")
    private String title;
    // The author should not be empty and should not exceed 200 characters
    @NotBlank(message = "Author is mandatory")
   @Size(max = 200, message = "Author should not exceed 200 characters")
    private String author;
    // The publication year should be a valid year

    @Min(value = 1000, message = "Publication year should be a valid year")
    @Max(value = 2021, message = "Publication year should be a valid year")
    private int publicationYear;
    // The ISBN should be a valid 10- or 13-digit number.


    @Min(value = 1000000000, message = "ISBN should be a valid 10- or 13-digit number")
    @Max(value = 9999999999999L, message = "ISBN should be a valid 10- or 13-digit number")
    private long isbn;
    // The price should be a positive decimal value.

//    @Min(value = 0, message = "Price should be a positive decimal value")
    @Positive(message = "Price should be a positive decimal value")
    private double price;

}
