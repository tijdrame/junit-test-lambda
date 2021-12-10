package com.emard.junit5.junitfive.lamda.oldVersion;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWordGreeting helloWordGreeting = new HelloWordGreeting();
        greeter.greet(helloWordGreeting);
    }
}
