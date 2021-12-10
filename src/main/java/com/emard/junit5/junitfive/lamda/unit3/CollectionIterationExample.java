package com.emard.junit5.junitfive.lamda.unit3;

import java.util.Arrays;
import java.util.List;

import com.emard.junit5.junitfive.lamda.unit1.Person;

//import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class CollectionIterationExample {
    
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlolle", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        people.forEach(
            //p-> log.info(p.toString())
            System.out::println
        );
    }
}
