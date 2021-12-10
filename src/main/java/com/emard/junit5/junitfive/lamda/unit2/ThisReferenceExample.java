package com.emard.junit5.junitfive.lamda.unit2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThisReferenceExample {
    
    public static void main(String[] args) {
        ThisReferenceExample example = new ThisReferenceExample();
        example.execute();
        example.doProcess(10, i -> {
            log.info("[{}]", i);
            //log.info("[{}]", this);
        });
    }

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute(){
        doProcess(10, i -> {
            log.info("[{}]",i);
            log.info("[{}]",this);
        });
    }
}
