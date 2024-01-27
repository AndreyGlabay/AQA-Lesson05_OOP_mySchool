package com.example.school.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class MainTests {
    @Test(description = "functionality_ABS55", groups = {"group1"})
    public void functionality_ABS55() throws NoSuchMethodException {
        System.out.println(
                "MainTests:: Name: " + getClass().getDeclaredMethod("functionality_ABS55").
                        getAnnotation(Test.class).description() +
                        ";  Class: " + getClass().getSimpleName() +
                        ";  Thread: " + Thread.currentThread().getName()
                );
    }

    @Test(description = "functionality_PTO78", groups = {"group1"})
    public void functionality_PTO78() throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_PTO78").
                getAnnotation(Test.class).description() +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @Test(description = "functionality_ASD225", priority = 2, groups = {"group1"})
    public void functionality_ASD225() throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_ASD225").
                getAnnotation(Test.class).description() +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @Test(description = "functionality_BCC101", priority = 1, groups = {"group1"})
    public void functionality_BCC101() throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_BCC101").
                getAnnotation(Test.class).description() +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @Test(description = "functionality_RCV42", groups = {"group1"})
    public void functionality_RCV42()  throws NoSuchMethodException {
        System.out.println("MainTests:: Name: " + getClass().getDeclaredMethod("functionality_RCV42").
                getAnnotation(Test.class).description() +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @BeforeClass(groups = {"group0"})
    public void login() {
        System.out.println("MainTests:: BEFORE CLASS;  Name: " +
                "login" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @AfterClass(groups = {"group0"})
    public void logout() {
        System.out.println("MainTests:: AFTER CLASS;  Name: " +
                "logout"  +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );;
    }

    @BeforeSuite(groups = {"group0"})
    public void openApp()  {
        System.out.println("MainTests:: BEFORE SUITE;  Name: " +
                "openApp"  +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @AfterSuite(groups = {"group0"})
    public void closeApp() {
        System.out.println("MainTests:: AFTER SUITE;  Name: " +
                "closeApp"  +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }
}