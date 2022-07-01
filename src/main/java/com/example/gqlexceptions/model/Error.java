package com.example.gqlexceptions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Error implements BookProfile {
    
    private String message;
    private String code;
}
