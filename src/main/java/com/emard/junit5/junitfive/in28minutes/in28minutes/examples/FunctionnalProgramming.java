package com.emard.junit5.junitfive.in28minutes.in28minutes.examples;

import java.util.List;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

/**
 * FunctionnalProgramming
 */
@Slf4j
public class FunctionnalProgramming {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        Predicate<String> predicate = p -> p.endsWith("at");
        //list.stream().forEach(System.out::println);
        
        //list.stream().filter(predicate).forEach(System.out::println);
        list.stream().filter(predicate).forEach(e -> log.info("[{}]", e));

        List<Integer> numbers = List.of(1, 10, 8, 5, 12, 25, 7);
        numbers.stream().forEach(System.out::println);


    }
}