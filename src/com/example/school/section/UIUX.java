package com.example.school.section;
import com.example.school.Student;
import com.example.school.additional.EnglishCourse;
import com.example.school.additional.EnglishGroup;

public class UIUX extends Student implements EnglishCourse {
    String englishLevel;
    boolean weekendIsSuitable;

    public UIUX(
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

    @Override
    public void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1300.UI/UX designer");
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
        return "UIUX-" + super.toString() + "Info for English classes: { " +
                "English Level= '" + englishLevel + '\'' +
                ",  Weekends Suitable? = " + weekendIsSuitable +
                " };";
    }
}