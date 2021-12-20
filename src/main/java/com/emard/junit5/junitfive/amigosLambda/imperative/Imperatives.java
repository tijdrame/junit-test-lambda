package com.emard.junit5.junitfive.amigosLambda.imperative;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Imperatives {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", GENDER.MALE),
                new Person("Maria", GENDER.FEMALE),
                new Person("Aisha", GENDER.FEMALE),
                new Person("Alex", GENDER.MALE),
                new Person("Alice", GENDER.FEMALE));

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(GENDER.FEMALE))
                females.add(person);
        }
        // for (Person person : females) log.info("{}", person);

        // Declarative approach
        people.stream().filter(p -> p.getGender().equals(GENDER.FEMALE)).forEach(System.out::println);
    }

    @Data
    static class Person {
        private final String name;
        private final GENDER gender;

    }

    enum GENDER {
        MALE, FEMALE
    }
}
