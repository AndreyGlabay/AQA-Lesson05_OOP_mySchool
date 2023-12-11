package com.example.school.section.course;

public class AQA_JavaBuilder { //Replace constructor 'com.example.school.section.course.AQA_Java' with builder 'com.example.school.section.course.AQA_JavaBuilder'"
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentMail;
    private boolean previouslyFinishedThisSchool;
    private int discount;
    private String fieldQA = "com.example.school.section.QA";
    private String englishLevel;
    private boolean weekendIsSuitable = true;
    private boolean hasComExperienceInTheField;
    private int yearsOfComExperience;

    public AQA_JavaBuilder setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public AQA_JavaBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public AQA_JavaBuilder setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
        return this;
    }

    public AQA_JavaBuilder setStudentMail(String studentMail) {
        this.studentMail = studentMail;
        return this;
    }

    public AQA_JavaBuilder setPreviouslyFinishedThisSchool(boolean previouslyFinishedThisSchool) {
        this.previouslyFinishedThisSchool = previouslyFinishedThisSchool;
        return this;
    }

    public AQA_JavaBuilder setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    public AQA_JavaBuilder setFieldQA(String fieldQA) {
        this.fieldQA = fieldQA;
        return this;
    }

    public AQA_JavaBuilder setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
        return this;
    }



    public AQA_JavaBuilder setWeekendIsSuitable(boolean weekendIsSuitable) {
        this.weekendIsSuitable = weekendIsSuitable;
        return this;
    }

    public AQA_JavaBuilder setHasComExperienceInTheField(boolean hasComExperienceInTheField) {
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        return this;
    }

    public AQA_JavaBuilder setYearsOfComExperience(int yearsOfComExperience) {
        this.yearsOfComExperience = yearsOfComExperience;
        return this;
    }

    public AQA_Java createAQA_Java() {
        return new AQA_Java(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount, fieldQA, englishLevel, weekendIsSuitable, hasComExperienceInTheField, yearsOfComExperience);
    }

    @Override // Generates String.Builder using 1st variant "String Concat (+)"
    public String toString() {
        return "AQA_JavaBuilder{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentMail='" + studentMail + '\'' +
                ", previouslyFinishedThisSchool=" + previouslyFinishedThisSchool +
                ", discount=" + discount +
                ", fieldQA='" + fieldQA + '\'' +
                ", englishLevel='" + englishLevel + '\'' +
                ", weekendIsSuitable=" + weekendIsSuitable +
                ", hasComExperienceInTheField=" + hasComExperienceInTheField +
                ", yearsOfComExperience=" + yearsOfComExperience +
                '}';
    }
}