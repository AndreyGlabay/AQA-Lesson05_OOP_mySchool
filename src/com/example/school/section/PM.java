package com.example.school.section;
import com.example.school.Student;
import com.example.school.additional.EnglishCourse;
import com.example.school.additional.EnglishGroup;

public class PM extends Student implements EnglishCourse {
    public String ITField; // add the var
    public String englishLevel;
    public boolean weekendIsSuitable;

    public PM(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String ITField, //add IT-Field
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount); //add IT-Field
        this.ITField = ITField; //add IT-Field for this class
        this.englishLevel = englishLevel;
        this.weekendIsSuitable = weekendIsSuitable;
    }

    public String getITField() {
        return ITField;
    }

    public void setITField(String ITField) {
        this.ITField = "PM";
    }

    @Override
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_1 + "! Your lessons will be each Saturday 11:00-12:00 AM PST");
    }

    @Override
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_2 + "! Your lessons will be each Sunday 3:00-4:00 PM PST");
    }

    @Override
    public String toString() {
        return "PM-" + super.toString() + "IT-Field = '" + ITField +  '\'' + ";  Info for English classes: { " +
                "English Level= '" + englishLevel + '\'' +
                ", Weekends Suitable? = " + weekendIsSuitable +
                " };";
    }
}