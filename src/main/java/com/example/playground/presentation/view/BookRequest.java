package com.example.playground.presentation.view;

import com.example.playground.domain.book.Book;

public class BookRequest {

    static BookRequest toBook(Book book) {
        return new BookRequest();
    }
}
