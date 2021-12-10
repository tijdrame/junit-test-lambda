package com.emard.junit5.junitfive.lamda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Unit1SolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlolle", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        // sort by last name
        Collections.sort(people, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));
        //Create a methode that prints all
        printBeginByC(people, p -> true);

        log.info("==============================================+++++++++++++++++++++++++++++++++++++++++++++++++");

        //Create a method that prints all people that have last name beginning with C
        printBeginByC(people, p-> p.getLastName().startsWith("C"));
        log.info("==============================================+++++++++++++++++++++++++++++++++++++++++++++++++");

        printBeginByC(people, p-> p.getFirstName().startsWith("T"));
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

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            log.info(person.toString());
        }
    }
    
}

interface Condition {
    boolean test(Person p);
}

