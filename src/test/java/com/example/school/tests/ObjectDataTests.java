package com.example.school.tests; // (step 1) Auto-created, when implemented ObjectDataTests java-class;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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
    }

    @Test(dataProvider = "data")
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
                "Actual studentName does not match any of the expected studentName.");
    }

    @Test(dataProvider = "data")
    public void testStudentPhone(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentPhone276 = "+17505151276";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentPhone, expectedStudentPhone276);
    }

    @Test(dataProvider = "data")
    public void testStudentMail(int studentId, String studentName, String studentPhone, String studentMail) {
        String expectedStudentMail376 = "prince@probe.com";
        var softAssert = new SoftAssert();
        softAssert.assertEquals(studentMail, expectedStudentMail376);
    }

    @Test(dataProvider = "data")
    public void testStudentPhoneNotNull(int studentId, String studentName, String studentPhone, String studentMail) {
        var softAssert = new SoftAssert();
        softAssert.assertNotNull(studentPhone);
    }
}
