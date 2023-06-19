package com.bookstoreapp.service;

import com.bookstoreapp.model.Book;

import java.util.List;

public interface BookstoreService {

   
    public List<Book> getAllBooks();
    
    public Book getBookById(int id);

   
    public Book saveBook(Book book);

   
    public Book updateBook(int id, Book book);

  
    public void deleteBook(int id);

}
