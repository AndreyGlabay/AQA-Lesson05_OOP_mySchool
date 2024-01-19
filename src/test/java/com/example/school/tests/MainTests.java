package com.example.school.tests;  // (step 0.c) Auto-created, when implemented MainTests java-class;

import org.testng.annotations.Test; // (step 0.c) Auto-created, when implemented MainTests java-class;


public class MainTests {    // (step 0.c) This line auto-created, when implemented MainTests java-class;
    // (step 1) Implement 5 test methods
    @Test
    public void login() {
        System.out.println("mySchool::login @ " + Thread.currentThread().getName());
    }
    @Test
    public void signup() {
        System.out.println("mySchool::signup @ " + Thread.currentThread().getName());
    }
    @Test
    public void functionality100(){
        System.out.println("mySchool::functionality100 @ " + Thread.currentThread().getName());
    }
    @Test
    public void functionality101(){
        System.out.println("mySchool::functionality101 @ " + Thread.currentThread().getName());
    }
    @Test
    public void functionality121(){
        System.out.println("mySchool::functionality121 @ " + Thread.currentThread().getName());
    }
}
