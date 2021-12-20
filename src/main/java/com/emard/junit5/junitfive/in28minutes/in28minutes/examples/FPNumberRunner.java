package com.emard.junit5.junitfive.in28minutes.in28minutes.examples;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FPNumberRunner {
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6, 8, 13, 3, 15);
        //numbers.stream().forEach(System.out::println);
        Integer nb= numbers.stream().reduce(0, (n1, n2)-> n1+n2);
        log.info("[{}]", nb);

    }
}
