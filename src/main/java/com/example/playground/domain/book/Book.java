package com.example.playground.domain.book;

import java.time.LocalDate;

public class Book {

    long id;
    BookNumber number;

    Title title;
    Author author;
    Publisher publisher;

    BookType bookType;
    Price unitPrice;

    LocalDate published;
    LocalDate registered;
}
