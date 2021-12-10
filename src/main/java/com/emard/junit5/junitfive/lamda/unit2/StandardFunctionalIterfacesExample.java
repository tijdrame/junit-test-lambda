package com.emard.junit5.junitfive.lamda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.emard.junit5.junitfive.lamda.unit1.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StandardFunctionalIterfacesExample {
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
        printBeginByC(people, p -> true, p-> log.info(p.toString()));

        log.info("==============================================+++++++++++++++++++++++++++++++++++++++++++++++++");

        //Create a method that prints all people that have last name beginning with C
        printBeginByC(people, p-> p.getLastName().startsWith("C"), p-> log.info(p.toString()));
        log.info("==============================================+++++++++++++++++++++++++++++++++++++++++++++++++");

        printBeginByC(people, p-> p.getFirstName().startsWith("T"), p-> log.info(p.toString()));
    }

    //private static void printBeginByC(List<Person> people, Condition c) {
    private static void printBeginByC(List<Person> people, Predicate<Person> p, Consumer<Person> c) {
        for (Person person : people) {
            //if(person.getLastName().startsWith("C")){
            if(p.test(person)){
                //log.info(person.toString());
                c.accept(person);
            }
        }
    }

    /*private static void printAll(List<Person> people) {
        for (Person person : people) {
            log.info(person.toString());
        }
    }*/
}
