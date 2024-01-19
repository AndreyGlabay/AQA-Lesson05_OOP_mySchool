 package com.example.school.tests; // (step 1) Auto-created, when implemented PriorityTests java-class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PriorityTests {
    // (step 1) Implement 5 test methods with different priorities;
    @Test(description = "test_A1", priority = 2) // (step 1.c) Implement test method with priority parameter;
    public void test_A1() throws NoSuchMethodException {
        System.out.println("PriorityTests::\t Name: test_A1" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t FYI: Priority=" + getClass().getDeclaredMethod("test_A1").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_A2", priority = 1) // (step 1.c) Implement test method with priority parameter;
    public void test_A2() throws NoSuchMethodException {
        System.out.println("PriorityTests::\t Name: test_A2" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t FYI: Priority=" + getClass().getDeclaredMethod("test_A2").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_B1", priority = 3) // (step 1.c) Implement test method with priority parameter;
    public void test_B1() throws NoSuchMethodException {
        System.out.println("PriorityTests::\t Name: test_B1" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t FYI: Priority=" + getClass().getDeclaredMethod("test_B1").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_B2", priority = 2) // (step 1.c) Implement test method with priority parameter;
    public void test_B2() throws NoSuchMethodException {
        System.out.println("PriorityTests::\t Name: test_B2" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t FYI: Priority=" + getClass().getDeclaredMethod("test_B2").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_B3", priority = 1) // (step 1.c) Implement test method with priority parameter;
    public void test_B3() throws NoSuchMethodException {
        System.out.println("PriorityTests::\t Name: test_B3" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t FYI: Priority=" + getClass().getDeclaredMethod("test_B3").getAnnotation(Test.class).priority()
        );
    }

    @BeforeClass // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    public void pre_Test() {
        System.out.println("PriorityTests::BeforeClass annotation PRE-TEST\t Name: " +
                "pre_Test" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    @AfterClass // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    public void post_Test() {
        System.out.println("PriorityTests::AfterClass annotation POST-TEST\t Name: " +
                "post_Test" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    @BeforeSuite // (step 1.f) Implements the Before/After Suite annotation.
    public void start_Test() {
        System.out.println("PriorityTests::AfterSuite annotation START-TESTING\t Name: " +
                "start_Test" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    @AfterSuite // (step 1.f) Implements the Before/After Suite annotation.
    public void stop_Test() {
        System.out.println("PriorityTests::AfterSuite annotation STOP-TESTING\t Name: " +
                "stop_Test" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }
}
