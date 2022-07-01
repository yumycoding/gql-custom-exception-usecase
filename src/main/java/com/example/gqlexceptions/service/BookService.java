package com.example.gqlexceptions.service;

import com.example.gqlexceptions.model.Book;
import com.example.gqlexceptions.model.BookProfile;
import com.example.gqlexceptions.model.Error;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<BookProfile> getBooks() {
        return List.of(
                new Book(1, "one"),
                new Error("asd", "404")
        );
    }

}
