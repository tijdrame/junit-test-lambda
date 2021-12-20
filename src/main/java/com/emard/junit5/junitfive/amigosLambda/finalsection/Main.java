package com.emard.junit5.junitfive.amigosLambda.finalsection;

import java.util.function.Consumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        hello("John", null, v -> log.info("no lastName provided for [{}]", v));
        hello2("John", null, () -> log.info("no lastName provided"));
    }

    static void hello(String firsName, String lastName, Consumer<String> callback) {
        log.info("[{}]", firsName);
        if(lastName !=null) log.info("[{}]", lastName);
        else callback.accept(firsName);
    }

    static void hello2(String firsName, String lastName, Runnable callback) {
        log.info("[{}]", firsName);
        if(lastName !=null) log.info("[{}]", lastName);
        else callback.run();
    }
}
