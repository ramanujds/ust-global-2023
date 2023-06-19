package com.bookstoreapp.service;

import com.bookstoreapp.model.Book;

import java.util.List;

public interface BookstoreService {

    // create method to get all books
    public List<Book> getAllBooks();
    // create method to get book by id
    public Book getBookById(int id);

    // create method to save book
    public Book saveBook(Book book);

    // create method to update book
    public Book updateBook(int id, Book book);

    // create method to delete book
    public void deleteBook(int id);

}
