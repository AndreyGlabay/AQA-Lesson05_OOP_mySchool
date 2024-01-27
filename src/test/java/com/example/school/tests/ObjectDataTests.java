package com.example.school.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;
import java.util.Objects;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

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

    @Test(description = "testStudentId", dataProvider = "data", groups = {"group1"})
    public void testStudentId(int studentId, String studentName, String studentPhone, String studentMail) {
        int expectedStudentId41 = 41;
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentId, expectedStudentId41);
        System.out.println("ObjectDataTests:: Name: testStudentId" +
                        ";  Class: " + getClass().getSimpleName() +
                        ";  Thread: " + Thread.currentThread().getName() +
                        ";  Summary: Check that ID is present in the provided data (4 Objects in Array)"
        );
    }

    @Test(description = "testStudentName", dataProvider = "data", groups = {"group1"})
    public void testStudentName(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentNameAlson = "Alson";
        String expectedStudentNameBert = "Bert";
        String expectedStudentNameYowl = "Yowl";
        String expectedStudentNameZara = "Zara";

        assertTrue(
                Objects.equals(studentName, expectedStudentNameAlson) ||
                        Objects.equals(studentName, expectedStudentNameBert) ||
                        Objects.equals(studentName, expectedStudentNameYowl) ||
                        Objects.equals(studentName, expectedStudentNameZara),
                "*** Negative test *** Check that expected Names, listed in this test, are NOT in provided data");

        System.out.println("ObjectDataTests:: Name: testStudentName" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  Summary: Check that expected Names, listed in this test, are in provided data"
        );
    }

    @Test(description = "testStudentPhone", dataProvider = "data", groups = {"group1"})
    public void testStudentPhone(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentPhone276 = "+17505151276";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentPhone, expectedStudentPhone276);
        System.out.println("ObjectDataTests:: Name: testStudentPhone"  +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  Summary: Check that expected Phone number is in provided data"
        );
    }

    @Test(description = "testStudentMail", dataProvider = "data", groups = {"group1"})
    public void testStudentMail(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentMail376 = "prince@probe.com";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentMail, expectedStudentMail376);
        System.out.println("ObjectDataTests:: Name: testStudentMail"  +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  Summary: Check that expected Email address is in provided data"
        );
    }

    @Test(description = "testStudentPhoneNotNull", dataProvider = "data", groups = {"group1"})
    public void testStudentPhoneNotNull(int studentId, String studentName, String studentPhone, String studentMail) {
        var softAssert = new SoftAssert();
        softAssert.assertNotNull(studentPhone);
        System.out.println("ObjectDataTests:: Name: testStudentPhoneNotNull"  +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName() +
                ";  Summary: Check that Phone field is provided"
        );
    }

    @BeforeClass(groups = {"group0"})
    public void preConditions() {
        System.out.println("ObjectDataTests:: BEFORE CLASS;  Name: " +
                "preConditions" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @AfterClass(groups = {"group0"})
    public void postConditions() {
        System.out.println("ObjectDataTests:: AFTER CLASS;  Name: " +
                "postConditions" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @BeforeSuite(groups = {"group0"})
    public void openPage() {
        System.out.println("ObjectDataTests:: BEFORE SUITE;  Name: " +
                "openPage" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }

    @AfterSuite(groups = {"group0"})
    public void closePage() {
        System.out.println("ObjectDataTests:: AFTER SUITE;  Name: " +
                "closePage" +
                ";  Class: " + getClass().getSimpleName() +
                ";  Thread: " + Thread.currentThread().getName()
        );
    }
}