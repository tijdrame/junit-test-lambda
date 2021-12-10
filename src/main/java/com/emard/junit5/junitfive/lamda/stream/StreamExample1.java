package com.emard.junit5.junitfive.lamda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.emard.junit5.junitfive.lamda.unit1.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamExample1 {

    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlolle", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );
        people.stream()
        .filter(p-> p.getFirstName().startsWith("C"))
        .forEach(p-> log.info("[{}]", p));

        //Stream<Person> stream = people.stream();
    }
}
