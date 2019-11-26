package com.example.bootwithdatabase.controller;

import com.example.bootwithdatabase.helpers.BookRequest;
import com.example.bootwithdatabase.helpers.BookView;
import com.example.bootwithdatabase.model.Book;
import com.example.bootwithdatabase.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @RequestMapping
    public Collection<BookView> get() {
        return repository.findAll().stream().map(BookView::new).collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity post(@RequestBody BookRequest book) {
        repository.save(new Book(book.getName()));
        return ResponseEntity.ok().build();
    }
}
