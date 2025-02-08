package com.jim.test;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book save(Book book) {
        return bookRepo.save(book);
    }
}
