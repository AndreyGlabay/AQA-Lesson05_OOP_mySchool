package com.example.school.tests;  // (step 0.c) Auto-created, when implemented MainTests java-class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class MainTests {    // (step 0.c) This line auto-created, when implemented MainTests java-class;
    @Test(description = "functionality_ABS55") // (step 1.a) Implement test method;
    public void functionality_ABS55() throws NoSuchMethodException { // (step 1.1.a) Exemption for get description property;
        System.out.println(
                "MainTests::\t Name: " + getClass().getDeclaredMethod("functionality_ABS55").
                        getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                        "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                        "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
                );
    }
    @Test(description = "functionality_PTO78") // (step 1.a) Implement test method;
    public void functionality_PTO78() throws NoSuchMethodException {
        System.out.println("MainTests::\t Name: " + getClass().getDeclaredMethod("functionality_PTO78").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    @Test(description = "functionality_ASD225", priority = 2)
    public void functionality_ASD225() throws NoSuchMethodException {
        System.out.println("MainTests::\t Name: " + getClass().getDeclaredMethod("functionality_ASD225").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    @Test(description = "functionality_BCC101", priority = 1)
    public void functionality_BCC101() throws NoSuchMethodException {
        System.out.println("MainTests::\t Name: " + getClass().getDeclaredMethod("functionality_BCC101").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.d) Add test method, set priority for this test run after login/setup tests;
    @Test(description = "functionality_RCV42")
    public void functionality_RCV42()  throws NoSuchMethodException {
        System.out.println("MainTests::\t Name: " + getClass().getDeclaredMethod("functionality_RCV42").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    @BeforeClass
    public void login() {
        System.out.println("MainTests:: BEFORE SUITE\t Name: " +
                "BeforeClass annotation LOGIN" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    @AfterClass
    public void logout() {
        System.out.println("MainTests:: AFTER CLASS\t Name: " +
                "AfterClass annotation LOGOUT"  + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );;
    }

    // (step 1.f) Implements the Before/After Suite annotation.
    @BeforeSuite
    public void openApp()  {
        System.out.println("MainTests:: BEFORE SUITE\t Name: " +
                "BeforeSuite annotation OPEN APP"  + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.f) Implements the Before/After Suite annotation.
    @AfterSuite
    public void closeApp() {
        System.out.println("MainTests:: AFTER SUITE\t Name: " +
                "AfterSuite annotation CLOSE APP"  + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }
}
