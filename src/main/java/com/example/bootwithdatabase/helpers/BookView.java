package com.example.bootwithdatabase.helpers;

import com.example.bootwithdatabase.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookView {
    private String id;
    private String name;

    public BookView(Book book) {
        this.id = book.getId().toString();
        this.name = book.getName();
    }
}
