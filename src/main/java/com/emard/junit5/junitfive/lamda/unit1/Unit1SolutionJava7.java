package com.emard.junit5.junitfive.lamda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Unit1SolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlolle", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        // sort by last name
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
            
        });
        //Create a methode that prints all
        printAll(people);

        log.info("==============================================");

        //Create a method that prints all people that have last name beginning with C
        printBeginByC(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("T");
            }
            
        });
    }

    private static void printBeginByC(List<Person> people, Condition c) {
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