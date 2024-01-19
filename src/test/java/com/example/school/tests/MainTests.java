package com.example.school.tests;  // (step 0.c) Auto-created, when implemented MainTests java-class;

import org.testng.annotations.*;


public class MainTests {    // (step 0.c) This line auto-created, when implemented MainTests java-class;
    @Test // (step 1.a) Implement test method;
    public void login() {
        System.out.println("MainTests::login @ " + Thread.currentThread().getName());
    }
    @Test // (step 1.a) Implement test method;
    public void signup() {
        System.out.println("MainTests::signup @ " + Thread.currentThread().getName());
    }
    @Test(priority = 1) // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    public void functionality100(){
        System.out.println("MainTests::functionality100 @ " + Thread.currentThread().getName());
    }
    @Test(priority = 1) // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    public void functionality101(){
        System.out.println("MainTests::functionality101 @ " + Thread.currentThread().getName());
    }
    @Test(priority = 1) // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    public void functionality121(){
        System.out.println("MainTests::functionality121 @ " + Thread.currentThread().getName());
    }

    @BeforeClass // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    public void beforeClass() {
        System.out.println("MainTests::this is BeforeClass annotation");
    }

    @AfterClass // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    public void afterClass() {
        System.out.println("MainTests::this is AfterClass annotation");
    }

    @BeforeSuite // (step 1.f) Implements the Before/After Suite annotation.
    public void beforeSuite() {
        System.out.println("MainTests::this is BeforeSuite annotation");
    }

    @AfterSuite // (step 1.f) Implements the Before/After Suite annotation.
    public void afterSuite() {
        System.out.println("MainTests::this is AfterSuite annotation");
    }
}
