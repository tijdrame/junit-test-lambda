package com.emard.junit5.junitfive.lamda.oldVersion;

public class HelloWordGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
    
}
