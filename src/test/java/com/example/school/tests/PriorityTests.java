 package com.example.school.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

 public class PriorityTests {
    @Test(description = "test_A1", priority = 2, groups = {"groupA"})
    public void test_A1() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_A1" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_A1").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_A2", priority = 1, groups = {"groupA"})
    public void test_A2() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_A2" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_A2").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_B1", priority = 3, groups = {"groupB"})
    public void test_B1() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_B1" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_B1").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_B2", priority = 2, groups = {"groupB"})
    public void test_B2() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_B2" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_B2").getAnnotation(Test.class).priority()
        );
    }

    @Test(description = "test_B3", priority = 1, groups = {"groupB"})
    public void test_B3() throws NoSuchMethodException {
        System.out.println("PriorityTests:: Name: test_B3" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  FYI: Priority=" + getClass().getDeclaredMethod("test_B3").getAnnotation(Test.class).priority()
        );
    }

     @Test(description = "test_C1", priority = 1, groups = {"groupC"})
     public void test_C1() throws NoSuchMethodException {
         System.out.println("PriorityTests:: Name: test_C1" +
                 ";  Class: " + getClass().getSimpleName() +
                 ";  Thread: " + Thread.currentThread().getName() +
                 ";  FYI: Priority=" + getClass().getDeclaredMethod("test_C1").getAnnotation(Test.class).priority()
         );
     }

     @Test(description = "test_C2", priority = 2, groups = {"groupC"})
     public void test_C2() throws NoSuchMethodException {
         System.out.println("PriorityTests:: Name: test_C2" +
                 ";  Class: " + getClass().getSimpleName() +
                 ";  Thread: " + Thread.currentThread().getName() +
                 ";  FYI: Priority=" + getClass().getDeclaredMethod("test_C2").getAnnotation(Test.class).priority()
         );
     }

     @Test(description = "test_C3", priority = 3, groups = {"groupC"})
     public void test_C3() throws NoSuchMethodException {
         System.out.println("PriorityTests:: Name: test_C3" +
                 ";  Class: " + getClass().getSimpleName() +
                 ";  Thread: " + Thread.currentThread().getName() +
                 ";  FYI: Priority=" + getClass().getDeclaredMethod("test_C3").getAnnotation(Test.class).priority()
         );
     }

     @Test(description = "test_C4", priority = 4, groups = {"groupC"})
     public void test_C4() throws NoSuchMethodException {
         System.out.println("PriorityTests:: Name: test_C4" +
                 ";  Class: " + getClass().getSimpleName() +
                 ";  Thread: " + Thread.currentThread().getName() +
                 ";  FYI: Priority=" + getClass().getDeclaredMethod("test_C4").getAnnotation(Test.class).priority()
         );
     }

    @BeforeClass(groups = {"group0"})
    public void pre_Test() {
        System.out.println("PriorityTests:: BEFORE CLASS;  Name: " +
                "pre_Test" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @AfterClass(groups = {"group0"})
    public void post_Test() {
        System.out.println("PriorityTests:: AFTER CLASS;  Name: " +
                "post_Test" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @BeforeSuite(groups = {"group0"})
    public void start_Test() {
        System.out.println("PriorityTests:: BEFORE SUITE;  Name: " +
                "start_Test" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @AfterSuite(groups = {"group0"})
    public void stop_Test() {
        System.out.println("PriorityTests:: AFTER SUITE;  Name: " +
                "stop_Test" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }
}