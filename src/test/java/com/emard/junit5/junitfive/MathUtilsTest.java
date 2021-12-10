package com.emard.junit5.junitfive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MathUtilsTest {
    MathUtils mathUtils;

    @BeforeEach
    void init(TestInfo info, TestReporter reporter) {
        /*log.info(info.getDisplayName());
        log.info("[{}]",info.getTags());
        log.info("[{}]",info.getTestMethod());*/
        reporter.publishEntry("Running ", info.getTestMethod().toString());
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup() {
        log.info("Cleaning up");
    }

    @Test
    @DisplayName("Testing add method")
    void testAdd() {
        Integer expected = 2;
        Integer actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "The add method ...");
    }

    @Test
    void testDivide() {
        boolean isServerUp = false;
        assumeTrue(isServerUp);
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by 0 should throw!");
    }

    @RepeatedTest(1)
    @Tag("Circle")
    void testComputeCircleArea() {
        Double actual = mathUtils.computeCircleArea(10d);
        assertEquals(314.1592653589793, actual, "Should return right circle area");
    }
}
