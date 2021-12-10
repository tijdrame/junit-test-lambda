package com.emard.junit5.junitfive.lamda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableExample {
    
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("Printed inside Runnable");
            }           
        });
        myThread.run();

        Thread myLambdThread = new Thread(()-> log.info("Printed inside Runnable"));
        myLambdThread.run();
    }
}
