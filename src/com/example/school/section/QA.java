package com.example.school.section;

import com.example.school.Student;

import com.example.school.additional.EnglishCourse;

import com.example.school.additional.EnglishGroup;

public class QA extends Student implements EnglishCourse {
    String fieldQA;
    String englishLevel;
    boolean weekendIsSuitable;

    public QA(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String fieldQA,
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.fieldQA = fieldQA;
    }



    public String getFieldQA() {
        return fieldQA;
    }

    public void setFieldQA(String fieldQA) {
        this.fieldQA = fieldQA;
    }

    @Override
    public void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1400.com.example.school.section.QA Engineer Manual;");
        System.out.println("   1401.AQA Engineer (Java);");
        System.out.println("   1402.AQA Engineer (JavaScript);");
        System.out.println("   1403.AQA Engineer (Python);");

    }

    @Override
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_3 + "! Your lessons will be each Saturday 1:00-2:00 PM PST");
    }

    @Override
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_4 + "! Your lessons will be each Sunday 6:00-7:00 PM PST");
    }

    @Override // Generates String.Builder using 2nd variant "String Concat (+) and super.toString()"
    public String toString() {
        return "QA{" +
                "\n\t fieldQA='" + fieldQA + '\'' +
                ",\n\t englishLevel='" + englishLevel + '\'' +
                ",\n\t weekendIsSuitable=" + weekendIsSuitable +
                "\n\t} " + "\n\t" + super.toString();
    }
}
