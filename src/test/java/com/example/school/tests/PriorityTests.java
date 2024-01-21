 package com.example.school.tests; // (step 1) Auto-created, when implemented PriorityTests java-class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

 public class PriorityTests {
    // (step 1) Implement 5 test methods with different priorities;
    // (step 1.c) Implement test method with priority parameter;
    @Test(description = "test_A1", priority = 2, groups = {"groupA"}) // (step 4) Implement parameter "groups";
    public void test_A1() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_A1" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_A1").getAnnotation(Test.class).priority()
        );
    }

    // (step 1.c) Implement test method with priority parameter;
    @Test(description = "test_A2", priority = 1, groups = {"groupA"}) // (step 4) Implement parameter "groups";
    public void test_A2() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_A2" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_A2").getAnnotation(Test.class).priority()
        );
    }

    // (step 1.c) Implement test method with priority parameter;
    @Test(description = "test_B1", priority = 3, groups = {"groupB"}) // (step 4) Implement parameter "groups";
    public void test_B1() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_B1" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_B1").getAnnotation(Test.class).priority()
        );
    }

    // (step 1.c) Implement test method with priority parameter;
    @Test(description = "test_B2", priority = 2, groups = {"groupB"}) // (step 4) Implement parameter "groups";
    public void test_B2() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_B2" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_B2").getAnnotation(Test.class).priority()
        );
    }

    // (step 1.c) Implement test method with priority parameter;
    @Test(description = "test_B3", priority = 1, groups = {"groupB"}) // (step 4) Implement parameter "groups";
    public void test_B3() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_B3" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_B3").getAnnotation(Test.class).priority()
        );
    }

    // (1.e) Add Before/After Test annotation -> (1.f) Modify it to the Before/After Class <- (3) Done in (1.e) & (1.f);
    @BeforeClass(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void pre_Test() {
        System.out.println("PriorityTests:: BEFORE CLASS;  Name: " +
                "pre_Test" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (1.e) Add Before/After Test annotation -> (1.f) Modify it to the Before/After Class <- (3) Done in (1.e) & (1.f);
    @AfterClass(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void post_Test() {
        System.out.println("PriorityTests:: AFTER CLASS;  Name: " +
                "post_Test" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.f) Implements the Before/After Suite annotation <- (step 3) Has been done in (step 1.f);
    @BeforeSuite(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void start_Test() {
        System.out.println("PriorityTests:: BEFORE SUITE;  Name: " +
                "start_Test" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.f) Implements the Before/After Suite annotation <- (step 3) Has been done in (step 1.f);
    @AfterSuite(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void stop_Test() {
        System.out.println("PriorityTests:: AFTER SUITE;  Name: " +
                "stop_Test" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }
}
