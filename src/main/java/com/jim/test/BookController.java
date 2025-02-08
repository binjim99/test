package com.jim.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BooKDto dto) {
        bookService.save(new Book(dto.title(), dto.author()));
        return "dash";
    }

    @GetMapping("/hello")
    public String save() {
        return "form";
    }
}
