package com.example.gqlexceptions.service;

import com.example.gqlexceptions.model.Book;
import com.example.gqlexceptions.model.Error;
import graphql.kickstart.tools.SchemaParserDictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {


    @Bean
    public SchemaParserDictionary schemaParserDictionary() {
        return new SchemaParserDictionary()
                .add(Book.class)
                .add(Error.class);
    }

}
