package com.emard.junit5.junitfive.lamda.unit2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClosuresExample {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(10, i -> log.info("[{}]",a+b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}