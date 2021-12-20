package com.emard.junit5.junitfive.amigosLambda.optional;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class _Optional {
    
    public static void main(String[] args) {
        //Object value = Optional.ofNullable(null).orElseGet(()->"default value");
        //Object value = Optional.ofNullable(null).orElseThrow(()-> new IllegalStateException("exception tidiane"));
        //Object value = Optional.ofNullable(null).orElse("default value");
        //Optional<String> ofNullable = Optional.ofNullable("john@gmail.com");
        Optional<String> ofNullable = Optional.ofNullable(null);
        ofNullable.ifPresentOrElse(e-> log.info("Sending email to [{}]", e), ()->log.info("Cannot send email"));
        //log.info("[{}]", ofNullable.get());
    }
}
