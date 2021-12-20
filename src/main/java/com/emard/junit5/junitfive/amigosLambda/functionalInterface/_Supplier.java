package com.emard.junit5.junitfive.amigosLambda.functionalInterface;

import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Supplier {
    public static void main(String[] args) {
        log.info("[{}]", getDbConnectionUrlSupplier.get());
    }

    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    static String getDbConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
