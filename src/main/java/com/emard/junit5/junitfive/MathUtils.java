package com.emard.junit5.junitfive;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MathUtils {
    
    public Integer add(Integer a, Integer b){
        return a + b;
    }

    public Integer substract(Integer a, Integer b){
        return a - b;
    }

    public Integer multiply(Integer a, Integer b){
        return a * b;
    }

    public Integer divide(Integer a, Integer b){
        return a / b;
    }

    public Double computeCircleArea(Double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        log.info(""+m.computeCircleArea(10d));
    }
}
