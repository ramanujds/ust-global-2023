package com.bookstoreapp.controller;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


public class BookstoreController {

    
    private BookstoreService bookstoreService;

    
    public List<Book> getAllBooks() {
        return null;
    }


   
    public Book saveBook(@RequestBody Book book) {
        return null;
    }

    
    public Book updateBook(int id, Book book) {
        return null;
    }

   
    public void deleteBook(int id) {
        
    }


    
   
   
    public Book getBookById(int id) {
       return null;
    }




}
