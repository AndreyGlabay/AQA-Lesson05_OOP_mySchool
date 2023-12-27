package com.example.school.section;
import com.example.school.Student;
import com.example.school.additional.EnglishCourse;
import com.example.school.additional.EnglishGroup;

public class QA extends Student implements EnglishCourse {
    public String ITField; // add the var
    String englishLevel;
    boolean weekendIsSuitable;

    public QA(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String ITField, //add IT-Field
            //String fieldQA,
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.ITField = ITField; //add IT-Field for this class
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
        return "QA-" + super.toString() + "IT-Field = '" + ITField +  '\'' + ";  Info for English classes: { " +
                "English Level= '" + englishLevel + '\'' +
                ",  Weekends Suitable? = " + weekendIsSuitable +
                " };";
    }
}