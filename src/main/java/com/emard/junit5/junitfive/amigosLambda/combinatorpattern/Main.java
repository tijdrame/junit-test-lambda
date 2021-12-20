package com.emard.junit5.junitfive.amigosLambda.combinatorpattern;

import static com.emard.junit5.junitfive.amigosLambda.combinatorpattern.ValidationResult.SUCCES;

import java.time.LocalDate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com", "+025865566", LocalDate.of(2000, 1, 25));
        //CustomervalidatorService service = new CustomervalidatorService();
        //log.info("is valid [{}] [{}]", customer, service.isValid(customer));

        //using combinetaor pattern
        ValidationResult result = CustomerRegistrationInterface.isEmailValid()
        .and(CustomerRegistrationInterface.isPhoneNumberValid()).and(CustomerRegistrationInterface.isAdult()).apply(customer);
        log.info("[{}]", result);
        if(!result.equals(SUCCES)) throw new IllegalStateException(result.name()); 
    }
}
