package com.bookstoreapp.controller;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BookstoreController.class)
public class BookControllerTest {

    // create object of MockMvc
    @Autowired
    MockMvc mockMvc;


    // create a mock of BookstoreService
    @MockBean
    BookstoreService bookstoreService;

    // create a test method to test getAllBooks()
    @Test
    public void testGetAllBooks() throws Exception {

        // Given
        // Create a list of books
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book(1, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0),
                new Book(2, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0),
                new Book(3, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0)
        ));
        // When
        // Mock the service method
        when(bookstoreService.getAllBooks()).thenReturn(books);
        // Then
        mockMvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$.[0].id").value(1))
                .andExpect(jsonPath("$.[0].title").value("The Alchemist"))
                .andExpect(jsonPath("$.[0].author").value("Paulo Coelho"))
                .andExpect(jsonPath("$.[0].publicationYear").value(1988))
                .andExpect(jsonPath("$.[0].isbn").value(156266262611L))
                .andExpect(jsonPath("$.[0].price").value(250.0))
                .andExpect(jsonPath("$.[1].id").value(2))
                .andExpect(jsonPath("$.[1].title").value("The Alchemist"))
                .andExpect(jsonPath("$.[1].author").value("Paulo Coelho"))
                .andExpect(jsonPath("$.[1].publicationYear").value(1988))
                .andExpect(jsonPath("$.[1].isbn").value(156266262611L))
                .andExpect(jsonPath("$.[1].price").value(250.0))
                .andExpect(jsonPath("$.[2].id").value(3))
                .andExpect(jsonPath("$.[2].title").value("The Alchemist"))
                .andExpect(jsonPath("$.[2].author").value("Paulo Coelho"))
                .andExpect(jsonPath("$.[2].publicationYear").value(1988))
                .andExpect(jsonPath("$.[2].isbn").value(156266262611L))
                .andExpect(jsonPath("$.[2].price").value(250.0))
                .andReturn();

    }

    // create a test method to test getBookById()
    @Test
    public void testGetBookById() throws Exception{
        // Given
        // Create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0);
        // When
        // Mock the service method
        when(bookstoreService.getBookById(1)).thenReturn(book);
        // Then
        mockMvc.perform(get("/books/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("The Alchemist"))
                .andExpect(jsonPath("$.author").value("Paulo Coelho"))
                .andExpect(jsonPath("$.publicationYear").value(1988))
                .andExpect(jsonPath("$.isbn").value(156266262611L))
                .andExpect(jsonPath("$.price").value(250.0))
                .andReturn();
        // Verify that the method is called only once
        verify(bookstoreService, times(1)).getBookById(1);

    }

    @Test

    // create a test method to test addBook()
    public void testAddBook() throws Exception{
        // Given
        // Create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0);
        // When
        // Mock the service method
        when(bookstoreService.saveBook(book)).thenReturn(book);
        // Then
        mockMvc.perform(post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(book)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("The Alchemist"))
                .andExpect(jsonPath("$.author").value("Paulo Coelho"))
                .andExpect(jsonPath("$.publicationYear").value(1988))
                .andExpect(jsonPath("$.isbn").value(156266262611L))
                .andExpect(jsonPath("$.price").value(250.0))
                .andReturn();
        // Verify that the method is called only once
        verify(bookstoreService, times(1)).saveBook(book);
    }


    @Test
    // create a test method to test updateBook()
    public void testUpdateBook() throws Exception{
        // Given
        // Create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0);
        // When
        // Mock the service method
        when(bookstoreService.updateBook(book.getId(),book)).thenReturn(book);
        // Then
        mockMvc.perform(put("/books/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(book)))
                .andExpect(status().isAccepted())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("The Alchemist"))
                .andExpect(jsonPath("$.author").value("Paulo Coelho"))
                .andExpect(jsonPath("$.publicationYear").value(1988))
                .andExpect(jsonPath("$.isbn").value(156266262611L))
                .andExpect(jsonPath("$.price").value(250.0))
                .andReturn();
        // Verify that the method is called only once
        verify(bookstoreService, times(1)).updateBook(book.getId(),book);
    }

    // create a test method to test deleteBook()
    @Test
    public void testDeleteBook() throws Exception{
        // Given
        // Create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0);
        // When
        // Mock the service method to do nothing
        doNothing().when(bookstoreService).deleteBook(1);

        // Then check the status code
        mockMvc.perform(delete("/books/1"))
                .andExpect(status().isOk())
                .andReturn();
        // Verify that the method is called only once
        verify(bookstoreService, times(1)).deleteBook(1);
    }




    // create a test method to convert a book object into a json string
    public String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }





}
