package com.example.school.tests;  // (step 0.c) Auto-created, when implemented MainTests java-class;

import org.testng.annotations.*;


public class MainTests {    // (step 0.c) This line auto-created, when implemented MainTests java-class;
    // (step 1) Implement 5 test methods
    @Test
    public void login() {
        System.out.println("MainTests::login @ " + Thread.currentThread().getName());
    }
    @Test
    public void signup() {
        System.out.println("MainTests::signup @ " + Thread.currentThread().getName());
    }
    @Test(priority = 1)
    public void functionality100(){
        System.out.println("MainTests::functionality100 @ " + Thread.currentThread().getName());
    }
    @Test(priority = 1)
    public void functionality101(){
        System.out.println("MainTests::functionality101 @ " + Thread.currentThread().getName());
    }
    @Test(priority = 1)
    public void functionality121(){
        System.out.println("MainTests::functionality121 @ " + Thread.currentThread().getName());
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("MainTests::this is BeforeClass annotation");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("MainTests::this is AfterClass annotation");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("MainTests::this is BeforeSuite annotation");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("MainTests::this is AfterSuite annotation");
    }
}
