package com.bookstoreapp.controller;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookstoreController {

    // create an object of BookstoreService
    @Autowired
    private BookstoreService bookstoreService;

    // create a get request to get all books
    // Return Response code of 200
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookstoreService.getAllBooks();
    }


    // create a POST request to save a book
    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book) {
        return bookstoreService.saveBook(book);
    }

    // create a PUT request to update a book
    // Return Response code of 202
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookstoreService.updateBook(id,book);
    }

    // create a DELETE request to delete a book
    // Return Response code of 204
    @ResponseStatus(code = HttpStatus.OK)
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id) {
        bookstoreService.deleteBook(id);
    }


    // create a GET request to get a book by id
    // Return Response code of 200
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookstoreService.getBookById(id);
    }




}
