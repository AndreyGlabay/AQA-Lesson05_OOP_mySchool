package com.example.school.tests; // (step 1) Auto-created, when implemented PriorityTests java-class;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTests {
    // (step 1) Implement 5 test methods with different priorities;
    @Test(priority = 1)
    public void test_A1() {
        System.out.println("Test_A1");
    }

    @Test(priority = 2)
    public void test_A2() {
        System.out.println("Test_A2");
    }

    @Test(priority = 1)
    public void test_B1() {
        System.out.println("Test_B1");
    }

    @Test(priority = 2)
    public void test_B2() {
        System.out.println("Test_B2");
    }

    @Test(priority = 3)
    public void test_B3() {
        System.out.println("Test_B3");
    }

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("PriorityTests::this is BeforeTest method");
    }

    @AfterTest
    public void afterTestMethod() {
        System.out.println("PriorityTests::this is AfterTest method");
    }

}
