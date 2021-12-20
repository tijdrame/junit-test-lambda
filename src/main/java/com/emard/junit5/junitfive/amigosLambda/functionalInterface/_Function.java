package com.emard.junit5.junitfive.amigosLambda.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Function;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Function {
    public static void main(String[] args) {
        Integer i = incrementByOne(1);
        log.info("[{}]", i);
        log.info("[{}]",incrementByOneFunction.andThen(multiplyBy10Function).apply(2));
        log.info("[{}] [{}]",multiplyBy10Function.andThen(incrementByOneFunction).apply(2), i);

        Customer c = new Customer("Tidiane", "99999");
        greetCustomerConsumer.accept(c, true);
    }

    static Function<Integer, Integer> incrementByOneFunction = n -> n+1;
    static Function<Integer, Integer> multiplyBy10Function = n -> n*10;

    static BiConsumer<Customer, Boolean> greetCustomerConsumer = (c, show)-> log.info("Hello [{}] [{}]", c.getName(), show ? c.getPhone() : "********" );
    //log.info("[{}] [{}]",c.getName(),c.getPhone()) : log.info("[{}] ********",c.getName());

    public static Integer incrementByOne(Integer i) {
        return i+1;
    }

    @Data
    static class Customer {
        private final  String name;
        private final String phone;
    }
}
