package com.emard.junit5.junitfive.amigosLambda.functionalInterface;

import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Predicate {
    public static void main(String[] args) {
        log.info("[{}]", isPhoneNumberValidPredicate.test("07003456789"));
        
        log.info("[{}]", isPhoneNumberValidPredicate.test("0900345678912"));

        log.info("[{}]", isPhoneNumberValidPredicate.and(containNumber3).test("07003456789"));
    }

    static Boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11 ;
    }

    static Predicate<String> isPhoneNumberValidPredicate = p -> p.startsWith("07") && p.length() == 11 ;
    static Predicate<String> containNumber3 = p -> p.contains("3") ;
}
