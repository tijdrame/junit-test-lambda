package com.emard.junit5.junitfive.amigosLambda.stream;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", GENDER.MALE),
                new Person("Maria", GENDER.FEMALE),
                new Person("Aisha", GENDER.FEMALE),
                new Person("Alex", GENDER.MALE),
                new Person("Alice", GENDER.FEMALE));
        /* ToIntFunction<? super String> mapper = String::length;
        Function<? super Person, ? extends String> personStringFunction = p -> p.name;
        IntConsumer println = System.out::println;
        people.stream().map(personStringFunction).mapToInt(mapper).forEach(println);;
        Consumer<? super GENDER> printlnGender = System.out::println;
        people.stream().map(p -> p.gender).collect(Collectors.toSet()).forEach(printlnGender);
        Set<GENDER> genders = people.stream().map(p -> p.gender).collect(Collectors.toSet());
        log.info("{}", genders);*/
        Predicate<? super Person> personPredicate = p -> GENDER.FEMALE.equals(p.gender);
        boolean containsOnlyFemales = people.stream().allMatch(personPredicate);
        log.info("[{}]", containsOnlyFemales);
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
