package com.example.bootwithdatabase.repository;

import com.example.bootwithdatabase.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
