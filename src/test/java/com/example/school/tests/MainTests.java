package com.example.school.tests;  // (step 0.c) Auto-created, when implemented MainTests java-class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

// (step 0.c) This line auto-created, when implemented MainTests java-class;
// (step 3) extends this class by MainTestsSuper, and move Before/After annotations there
public class MainTests {
    // (step 1.a) Implement test method;
    @Test(description = "functionality_ABS55", groups = {"group1"}) // (step 4) Implement parameter "groups";
    public void functionality_ABS55() throws NoSuchMethodException { // (step 1.1.a) Exemption for get description property;
        System.out.println(
                "MainTests:: Name: " + getClass().getDeclaredMethod("functionality_ABS55").
                        getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                        ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                        ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
                );
    }

    // (step 1.a) Implement test method;
    @Test(description = "functionality_PTO78", groups = {"group1"}) // (step 4) Implement parameter "groups";
    public void functionality_PTO78() throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_PTO78").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    @Test(description = "functionality_ASD225", priority = 2, groups = {"group1"}) // (4) Implement parameter "groups";
    public void functionality_ASD225() throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_ASD225").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.d) Add  test method, set priority for this test run after login/setup tests;
    @Test(description = "functionality_BCC101", priority = 1, groups = {"group1"}) // (4) Implement parameter "groups";
    public void functionality_BCC101() throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_BCC101").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.d) Add test method, set priority for this test run after login/setup tests;
    @Test(description = "functionality_RCV42", groups = {"group1"}) // (step 4) Implement parameter "groups";
    public void functionality_RCV42()  throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_RCV42").
                getAnnotation(Test.class).description() + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (1.e) Add Before/After Test annotation -> (1.f) Modify it to the Before/After Class <- (3) Done in (1.e) & (1.f);
    @BeforeClass(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void login() {
        System.out.println("MainTests:: BEFORE CLASS;  Name: " +
                "login" + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (1.e) Add Before/After Test annotation -> (1.f) Modify it to the Before/After Class <- (3) Done in (1.e) & (1.f);
    @AfterClass(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void logout() {
        System.out.println("MainTests:: AFTER CLASS;  Name: " +
                "logout"  + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );;
    }

    // (step 1.f) Implements the Before/After Suite annotation <- (step 3) Has been done in (step 1.f);
    @BeforeSuite(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void openApp()  {
        System.out.println("MainTests:: BEFORE SUITE;  Name: " +
                "openApp"  + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.f) Implements the Before/After Suite annotation <- (step 3) Has been done in (step 1.f);
    @AfterSuite(groups = {"group0"}) // (step 4) Implement parameter "groups";
    public void closeApp() {
        System.out.println("MainTests:: AFTER SUITE;  Name: " +
                "closeApp"  + // (step 1.1.a) Get test method's Name from description;
                ";  Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                ";  Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }
}
