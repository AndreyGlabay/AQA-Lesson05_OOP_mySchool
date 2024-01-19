package com.example.school.tests; // (step 1) Auto-created, when implemented ObjectDataTests java-class;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.Objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ObjectDataTests {
    @DataProvider
    public Object[][] data() {
        return new Object[][] {
                {41, "Alson", "+17505151041", "alson@probe.com"},
                {276, "Indira", "+17505151276", "indira@probe.com"},
                {376, "Prince", "+17505151376", "prince@probe.com"},
                {601, "Yowl", "+17505151601", "yowl@probe.com"}
        };
    }

    // (step 1) Implement 5 test methods with use data from the data provider;
    @Test(dataProvider = "data")
    public void testStudentId(int studentId, String studentName, String studentPhone, String studentMail) {
        int expectedStudentId41 = 41;
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentId, expectedStudentId41);
        System.out.println("ObjectDataTests::Check that ID = 41 is present in the provided data (4 Objects in Array)");
    }

    @Test(dataProvider = "data")
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
                "Actual studentNames do not match any of the expected studentNames.");

        System.out.println("ObjectDataTests::Check that expected Names, listed in this test, provided OR not");
    }

    @Test(dataProvider = "data")
    public void testStudentPhone(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentPhone276 = "+17505151276";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentPhone, expectedStudentPhone276);
        System.out.println("ObjectDataTests::Check that expected Phone number is in provided data");
    }

    @Test(dataProvider = "data")
    public void testStudentMail(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentMail376 = "prince@probe.com";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentMail, expectedStudentMail376);
        System.out.println("ObjectDataTests::Check that expected Email address is in provided data");
    }

    @Test(dataProvider = "data")
    public void testStudentPhoneNotNull(int studentId, String studentName, String studentPhone, String studentMail) {
        var softAssert = new SoftAssert();
        softAssert.assertNotNull(studentPhone);
        System.out.println("ObjectDataTests::Check that Phone field is provided");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("ObjectDataTests::this is BeforeClass annotation");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("ObjectDataTests::this is AfterClass annotation");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("ObjectDataTests::this is BeforeSuite annotation");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("ObjectDataTests::this is AfterSuite annotation");
    }
}
