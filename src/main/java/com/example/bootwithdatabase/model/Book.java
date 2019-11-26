package com.example.bootwithdatabase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    private UUID id;

    private String name;

    public Book(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}

