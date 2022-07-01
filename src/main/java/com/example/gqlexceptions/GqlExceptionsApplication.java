package com.example.gqlexceptions;

import com.example.gqlexceptions.model.BookProfile;
import com.example.gqlexceptions.service.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class GqlExceptionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GqlExceptionsApplication.class, args);
    }

}

@Component
class MessageResolver implements GraphQLQueryResolver {

    @Autowired
    BookService bookService;

    public void hello() {
        throw new MyException();
    }

    public String msg(String msg) {
        return "Hello World " + msg;
    }

    public List<BookProfile> findBook(int id) {
        return bookService.getBooks();
    }

}


