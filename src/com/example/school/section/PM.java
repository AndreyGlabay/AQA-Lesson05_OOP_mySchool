package com.example.school.section;
import com.example.school.Student;
import com.example.school.additional.EnglishCourse;
import com.example.school.additional.EnglishGroup;
import java.util.StringJoiner;

public class PM extends Student implements EnglishCourse {
    String fieldPM;
    public String englishLevel;
    public boolean weekendIsSuitable;

    public PM(
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

    public String getFieldPM() {
        return fieldPM;
    }

    public void setFieldPM(String fieldPM) {
        this.fieldPM = fieldPM;
    }

    @Override
    public void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1100.Project Management");
    }

    @Override
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_1 + "! Your lessons will be each Saturday 11:00-12:00 AM PST");
    }

    @Override
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_2 + "! Your lessons will be each Sunday 3:00-4:00 PM PST");
    }

//     ************ HIDE THIS PART TO COMMENTS - TASK ABOUT DIFF STRING BUILDERS USAGE ************
//    @Override // Generates String.Builder using 5th variant "StringJoiner (JDK 1.8)"
//    public String toString() {
//        return new StringJoiner(", ", PM.class.getSimpleName() + "[", "]")
//                .add("fieldPM='" + fieldPM + "'")
//                .add("englishLevel='" + englishLevel + "'")
//                .add("weekendIsSuitable=" + weekendIsSuitable)
//                .toString();
//    }

    @Override
    public String toString() {
        return "PM-" + super.toString() + "Info for English classes: { " +
                "English Level= '" + englishLevel + '\'' +
                ",  Weekends Suitable? = " + weekendIsSuitable +
                " };";
    }
}