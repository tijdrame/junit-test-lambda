package com.emard.junit5.junitfive.amigosLambda.combinatorpattern;

import java.time.LocalDate;

import lombok.Data;


@Data
public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;
}
