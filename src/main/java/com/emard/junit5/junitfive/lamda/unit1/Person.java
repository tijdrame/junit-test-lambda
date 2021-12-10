package com.emard.junit5.junitfive.lamda.unit1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
}
