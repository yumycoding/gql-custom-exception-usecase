package com.example.gqlexceptions;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SanitizedExceptionMsg implements GraphQLError {

    private String message;
    private String errorCode;
    private ErrorType errorType;
    private Throwable exception;



    public SanitizedExceptionMsg(String message, String errorCode, ErrorType errorType, Throwable exception) {
        this.message = message;
        this.errorCode = errorCode;
        this.errorType = errorType;
        this.exception = exception;
    }


    public String getType() {
        return "Hello World";
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return this.errorType;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Collections.singletonMap("Error Code", errorCode);
    }
}
