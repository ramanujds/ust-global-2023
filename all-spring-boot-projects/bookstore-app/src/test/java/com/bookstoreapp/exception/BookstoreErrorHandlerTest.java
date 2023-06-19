package com.bookstoreapp.exception;

import com.bookstoreapp.controller.BookstoreController;
import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import javax.validation.ValidationException;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BookstoreController.class)
public class BookstoreErrorHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookstoreService bookstoreService;


    @Test
    // create a method to handle BookNotFoundException
    public void testHandleBookNotFoundException() throws Exception{

        // Given

        // When
        when(bookstoreService.getBookById(1)).thenThrow(new BookNotFoundException("Book not found"));

        // Then

        mockMvc.perform(get("/books/1"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404))
                .andExpect(jsonPath("$.message").value("Book not found"))
                .andExpect(jsonPath("$.timestamp").isNotEmpty())
                .andExpect(jsonPath("$.path").value("/books"))
                .andExpect(jsonPath("$.error").value("Not Found"))
                .andDo(print());

        // verify the service method is called only once
        verify(bookstoreService, times(1)).getBookById(1);



    }


    // create a method to handle BookAlreadyExistsException

     @Test
    public void testHandleBookAlreadyExistsException() throws Exception{

        // Given
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988,156266262611L,250.0);

        // When
        when(bookstoreService.saveBook(any())).thenThrow(new BookAlreadyExistsException("Book already exists"));

        // Then

        mockMvc.perform(post("/books")
                .contentType("application/json")
                .content(convertObjectToJsonString(book)))
                .andExpect(status().isConflict())
                .andExpect(jsonPath("$.status").value(409))
                .andExpect(jsonPath("$.message").value("Book already exists"))
                .andExpect(jsonPath("$.timestamp").isNotEmpty())
                .andExpect(jsonPath("$.path").value("/books"))
                .andExpect(jsonPath("$.error").value("Conflict"))
                .andDo(print())
                .andReturn();

        // verify the service method is called only once
        verify(bookstoreService, times(1)).saveBook(any());



    }

    // create a method to validate the request body

     @Test
    public void testHandleMethodArgumentNotValidException() throws Exception{

        // Given
        Book book = new Book(0, "", "", 1,1L,0.0);

        // When
        when(bookstoreService.saveBook(book)).thenThrow(new ValidationException("Validation failed"));

        // Then

        mockMvc.perform(post("/books")
                .contentType("application/json")
                .content(convertObjectToJsonString(book)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.status").value(400))
                .andExpect(jsonPath("$.message").value("Validation failed"))
                .andExpect(jsonPath("$.timestamp").isNotEmpty())
                .andExpect(jsonPath("$.path").value("/books"))
                .andExpect(jsonPath("$.error").value("Bad Request"))
                .andDo(print())
                .andReturn();


    }

    // create a method to handle Exception

    @Test
    public void testHandleException() throws Exception {

        // Given

        // When
        when(bookstoreService.getBookById(1)).thenThrow(new RuntimeException(("Internal server error")));

        // Then

        mockMvc.perform(get("/books/1"))
                .andExpect(status().isInternalServerError())
                .andExpect(jsonPath("$.status").value(500))
                .andExpect(jsonPath("$.message").value("Internal server error"))
                .andExpect(jsonPath("$.timestamp").isNotEmpty())
                .andExpect(jsonPath("$.path").value("/books"))
                .andExpect(jsonPath("$.error").value("Internal Server Error"))
                .andDo(print())
                .andReturn();

        // verify the service method is called only once
        verify(bookstoreService, times(1)).getBookById(1);
    }


    // create a method to convert java object to json string
    public String convertObjectToJsonString(Object object) throws Exception{

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);

    }

}
