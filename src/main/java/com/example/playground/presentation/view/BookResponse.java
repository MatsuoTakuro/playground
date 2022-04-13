package com.example.playground.presentation.view;

import com.example.playground.domain.book.Book;

public class BookResponse {

    static BookResponse fromBook(Book book) {
        return new BookResponse();
    }
}
