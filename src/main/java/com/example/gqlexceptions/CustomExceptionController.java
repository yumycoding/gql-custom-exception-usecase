package com.example.gqlexceptions;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import graphql.language.SourceLocation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@Component
public class CustomExceptionController {

    @ExceptionHandler(MyException.class)
    public SanitizedExceptionMsg myError(MyException exception) {
        return new SanitizedExceptionMsg("Internal Server Error", "500", ErrorType.DataFetchingException, exception);
    }

    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError runTimeException(RuntimeException exception) {
        return new ThrowableGraphQLError(exception, "Runtime Server Error");
    }


}
