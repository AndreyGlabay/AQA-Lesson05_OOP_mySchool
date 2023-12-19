package com.example.school.section;
import com.example.school.Student;
import com.example.school.additional.EnglishCourse;
import com.example.school.additional.EnglishGroup;

public class UIUX extends Student implements EnglishCourse {
    String fieldUIUX;
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

    public String getFieldUIUX() {
        return fieldUIUX;
    }

    public void setFieldUIUX(String fieldUIUX) {
        this.fieldUIUX = fieldUIUX;
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

    // HIDE TO COMMENTS FOR SEPARATE TASK TO USE DIFF STRING BUILDERS
//    @Override // Generates String.Builder using 4th variant "StringBuilder (JDK 1.5)"
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("UIUX{");
//        sb.append("fieldUIUX='").append(fieldUIUX).append('\'');
//        sb.append(", englishLevel='").append(englishLevel).append('\'');
//        sb.append(", weekendIsSuitable=").append(weekendIsSuitable);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "UIUX { " +
                "id=" + getStudentId() +
                ",  Name='" + getStudentName() + '\'' +
                ",  Phone='" + getStudentPhone() + '\'' +
                ",  Email='" + getStudentMail() + '\'' +
                ",  Previously Finished This School? = " + previouslyFinishedThisSchool +
                " -> discount = " + getDiscount() + '%' +
                ",  English Level= '" + englishLevel + '\'' +
                ",  Weekends Suitable? =" + weekendIsSuitable +
                " }   " + super.toString();
    }
}
