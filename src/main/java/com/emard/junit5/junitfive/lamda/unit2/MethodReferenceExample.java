package com.emard.junit5.junitfive.lamda.unit2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MethodReferenceExample {
    
    public static void main(String[] args) {
        Thread t = new Thread(MethodReferenceExample::printMsg); //<=> ()-> printMsg()
        t.start();
    }

    public static void printMsg() {
        log.info("Hello[{}]");
    }
}
