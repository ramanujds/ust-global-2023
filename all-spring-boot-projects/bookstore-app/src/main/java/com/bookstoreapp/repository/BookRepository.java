package com.bookstoreapp.repository;

import com.bookstoreapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
