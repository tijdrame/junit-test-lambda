package com.emard.junit5.junitfive.lamda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Java8LamdaBasics {
    
    public static void main(String[] args) {
        MyLamda greeting = () ->  log.info("Hello Greeting");
        greeting.foo();

        MyAdd add = (a, b) -> a + b;
        log.info("add = [{}]", add.add(8, 7));

        StringLength length =  s -> s.length();
        log.info("length [{}]", length.length("Hello lambda"));
    }
}

@FunctionalInterface
interface MyLamda {
    void foo();
}

interface MyAdd {
    Integer add(Integer a, Integer b);
}

interface StringLength {
    Integer length(String s);
}