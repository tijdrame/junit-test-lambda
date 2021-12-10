package com.emard.junit5.junitfive.lamda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.emard.junit5.junitfive.lamda.unit1.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlolle", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        

        log.info("==============================================+++++++++++++++++++++++++++++++++++++++++++++++++");

        //Create a method that prints all people that have last name beginning with C
        printBeginByC(people, p-> p.getLastName().startsWith("C"));
        log.info("==============================================+++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    //private static void printBeginByC(List<Person> people, Condition c) {
    private static void printBeginByC(List<Person> people, Predicate<Person> c) {
        for (Person person : people) {
            //if(person.getLastName().startsWith("C")){
            if(c.test(person)){
                log.info(person.toString());
            }
        }
    }

}