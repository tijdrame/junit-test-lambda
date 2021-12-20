package com.emard.junit5.junitfive.amigosLambda.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomervalidatorService {
    
    private Boolean isEmailValid(String email){
        return email.contains("@");
    }

    private Boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }

    private Boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public Boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
    }
}

