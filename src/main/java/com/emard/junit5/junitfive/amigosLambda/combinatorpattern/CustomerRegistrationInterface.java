package com.emard.junit5.junitfive.amigosLambda.combinatorpattern;

import static com.emard.junit5.junitfive.amigosLambda.combinatorpattern.ValidationResult.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

//import static CustomerRegistrationValidator.*;
//import static ValidationResult.*;

/**
 * CustomerRegistrationInterface
 */
public interface CustomerRegistrationInterface extends Function<Customer, ValidationResult> {

    static CustomerRegistrationInterface isEmailValid () {
        return c -> c.getEmail().contains("@") ? SUCCES : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationInterface isPhoneNumberValid () {
        return c -> c.getPhoneNumber().startsWith("+0") ? SUCCES : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationInterface isAdult () {
        return c -> Period.between(c.getDob(), LocalDate.now()).getYears() > 16 ? SUCCES : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationInterface and(CustomerRegistrationInterface other){
        return c -> {
            ValidationResult result = this.apply(c);
            return result.equals(SUCCES) ? other.apply(c): result;
        };
    }
}