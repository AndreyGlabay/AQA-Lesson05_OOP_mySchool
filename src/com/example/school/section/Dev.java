package com.example.school.section;

import com.example.school.Student;

import com.example.school.additional.EnglishCourse;

import com.example.school.additional.EnglishGroup;

public class Dev extends Student implements EnglishCourse {
    String fieldDev;
    String englishLevel;
    boolean weekendIsSuitable;

    public Dev(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.englishLevel = englishLevel;
        this.weekendIsSuitable = weekendIsSuitable;
    }

    public String getFieldDev() {
        return fieldDev;
    }

    public void setFieldDev(String fieldDev) {
        this.fieldDev = fieldDev;
    }

    @Override
    public void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1201.Software Developer (Java);");
        System.out.println("   1202.Software Developer (JavaScript);");
        System.out.println("   1203.Software Developer (Python);");
    }

    @Override
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_3 + "! Your lessons will be each Saturday 1:00-2:00 PM PST");
    }

    @Override
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_4 + "! Your lessons will be each Sunday 6:00-7:00 PM PST");
    }

    @Override // Generates String.Builder using 3rd variant "StringBuffer"
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dev{");
        sb.append("fieldDev='").append(fieldDev).append('\'');
        sb.append(", englishLevel='").append(englishLevel).append('\'');
        sb.append(", weekendIsSuitable=").append(weekendIsSuitable);
        sb.append('}');
        return sb.toString();
    }
}
