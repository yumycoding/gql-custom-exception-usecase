package com.example.gqlexceptions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book implements BookProfile {
    private int id;
    private String name;
}
