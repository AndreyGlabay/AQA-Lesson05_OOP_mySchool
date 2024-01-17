package com.example.school.section;
import com.example.school.Student;
import com.example.school.additional.EnglishCourse;
import com.example.school.additional.EnglishGroup;

public class Dev extends Student implements EnglishCourse {
    public String ITField;
    String englishLevel;
    boolean weekendIsSuitable;

    public Dev(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String ITField,
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.ITField = ITField;
        this.englishLevel = englishLevel;
        this.weekendIsSuitable = weekendIsSuitable;
    }

    @Override
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_3 + "! Your lessons will be each Saturday 1:00-2:00 PM PST");
    }

    @Override
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_4 + "! Your lessons will be each Sunday 6:00-7:00 PM PST");
    }

    @Override
    public String toString() {
        return "Dev-" + super.toString() + "IT-Field = '" + ITField +  '\'' + ";  Info for English classes: { " +
                "English Level= '" + englishLevel + '\'' +
                ",  Weekends Suitable? = " + weekendIsSuitable +
                " };";
    }
}