package com.example.school.tests; // (step 1) Auto-created, when implemented ObjectDataTests java-class;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;

import java.util.Objects;

public class ObjectDataTests {
    @DataProvider // (step 1.b) Implement data provider, for using tests from it;
    public Object[][] data() {
        return new Object[][] {
                {41, "Alson", "+17505151041", "alson@probe.com"},
                {276, "Indira", "+17505151276", "indira@probe.com"},
                {376, "Prince", "+17505151376", "prince@probe.com"},
                {601, "Yowl", "+17505151601", "yowl@probe.com"}
        };
    }

    // (step 1.b) Implement test method with use of data from the data provider;
    @Test(description = "testStudentId", dataProvider = "data")
    public void testStudentId(int studentId, String studentName, String studentPhone, String studentMail) {
        int expectedStudentId41 = 41;
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentId, expectedStudentId41);
        System.out.println("ObjectDataTests::\t Name: testStudentId" + // (step 1.1.a) Get test method's Name from description;
                        "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                        "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t Summary: Check that ID is present in the provided data (4 Objects in Array)"
        );
    }

    // (step 1.b) Implement test method with use of data from the data provider;
    @Test(description = "testStudentName", dataProvider = "data")
    public void testStudentName(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentNameAlson = "Alson";
        String expectedStudentNameBert = "Bert"; // Negative: Such Name is not provided;
        String expectedStudentNameYowl = "Yowl";
        String expectedStudentNameZara = "Zara"; // Negative: Such Name is not provided;

        assertTrue(
                Objects.equals(studentName, expectedStudentNameAlson) ||
                        Objects.equals(studentName, expectedStudentNameBert) ||
                        Objects.equals(studentName, expectedStudentNameYowl) ||
                        Objects.equals(studentName, expectedStudentNameZara),
                "*** Negative test *** Check that expected Names, listed in this test, are NOT in provided data");

        System.out.println("ObjectDataTests::\t Name: testStudentName" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t Summary: Check that expected Names, listed in this test, are in provided data"
        );
    }

    // (step 1.b) Implement test method with use of data from the data provider;
    @Test(description = "testStudentPhone", dataProvider = "data")
    public void testStudentPhone(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentPhone276 = "+17505151276";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentPhone, expectedStudentPhone276);
        System.out.println("ObjectDataTests::\t Name: testStudentPhone"  + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t Summary: Check that expected Phone number is in provided data"
        );
    }

    // (step 1.b) Implement test method with use of data from the data provider;
    @Test(description = "testStudentMail", dataProvider = "data")
    public void testStudentMail(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentMail376 = "prince@probe.com";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentMail, expectedStudentMail376);
        System.out.println("ObjectDataTests::\t Name: testStudentMail"  + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t Summary: Check that expected Email address is in provided data"
        );
    }

    // (step 1.b) Implement test method with use of data from the data provider;
    @Test(description = "testStudentPhoneNotNull", dataProvider = "data")
    public void testStudentPhoneNotNull(int studentId, String studentName, String studentPhone, String studentMail) {
        var softAssert = new SoftAssert();
        softAssert.assertNotNull(studentPhone);
        System.out.println("ObjectDataTests::\t Name: testStudentPhoneNotNull"  + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() + // (step 1.1.b)  Get test method's Thread;
                "; \t Summary: Check that Phone field is provided"
        );
    }

    // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    @BeforeClass
    public void preConditions() {
        System.out.println("ObjectDataTests::BeforeClass annotation PRE-CONDS\t Name: " +
                "preConditions" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.e) Add Before/After Test annotation -> (step 1.f) Modify it to the Before/After Class.
    @AfterClass
    public void postConditions() {
        System.out.println("ObjectDataTests::AfterClass annotation POST-CONDS\t Name: " +
                "postConditions" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.f) Implements the Before/After Suite annotation.
    @BeforeSuite
    public void openPage() {
        System.out.println("ObjectDataTests::BeforeSuite annotation OPEN PAGE\t Name: " +
                "openPage" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }

    // (step 1.f) Implements the Before/After Suite annotation.
    @AfterSuite
    public void closePage() {
        System.out.println("ObjectDataTests::AfterSuite annotation CLOSE PAGE\t Name: " +
                "closePage" + // (step 1.1.a) Get test method's Name from description;
                "; \t Class: " + getClass().getSimpleName() + // (step 1.1.b)  Get test method's Class name;
                "; \t Thread: " + Thread.currentThread().getName() // (step 1.1.b)  Get test method's Thread;
        );
    }
}
