package com.example.school.tests; // (step 1) Auto-created, when implemented PriorityTests java-class;

import org.testng.annotations.*;

public class PriorityTests {
    // (step 1) Implement 5 test methods with different priorities;
    @Test(priority = 1) // (step 1.c) Implement test method with priority parameter;
    public void test_A1() {
        System.out.println("PriorityTests::Test_A1");
    }

    @Test(priority = 2) // (step 1.c) Implement test method with priority parameter;
    public void test_A2() {
        System.out.println("PriorityTests::Test_A2");
    }

    @Test(priority = 1) // (step 1.c) Implement test method with priority parameter;
    public void test_B1() {
        System.out.println("PriorityTests::Test_B1");
    }

    @Test(priority = 2) // (step 1.c) Implement test method with priority parameter;
    public void test_B2() {
        System.out.println("PriorityTests::Test_B2");
    }

    @Test(priority = 3) // (step 1.c) Implement test method with priority parameter;
    public void test_B3() {
        System.out.println("PriorityTests::Test_B3");
    }

    @BeforeClass // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    public void beforeClass() {
        System.out.println("PriorityTests::this is BeforeClass annotation");
    }

    @AfterClass // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    public void afterClass() {
        System.out.println("PriorityTests::this is AfterClass annotation");
    }

    @BeforeSuite // (step 1.f) Implements the Before/After Suite annotation.
    public void beforeSuite() {
        System.out.println("PriorityTests::this is BeforeSuite annotation");
    }

    @AfterSuite // (step 1.f) Implements the Before/After Suite annotation.
    public void afterSuite() {
        System.out.println("PriorityTests::this is AfterSuite annotation");
    }

}
