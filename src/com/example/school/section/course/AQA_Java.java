package com.example.school.section.course;
import com.example.school.section.QA;

public class AQA_Java extends QA {

    boolean hasComExperienceInTheField;
    int yearsOfComExperience;

    public AQA_Java( // Replace constructor "com.example.school.section.course.AQA_Java" with builder "com.example.school.section.course.AQA_JavaBuilder"
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String fieldQA,
                     String englishLevel,
                     boolean weekendIsSuitable,
            boolean hasComExperienceInTheField,
            int yearsOfComExperience) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount, fieldQA, englishLevel, weekendIsSuitable);
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        this.yearsOfComExperience = yearsOfComExperience;
    }

    public boolean isHasComExperienceInTheField() {
        return hasComExperienceInTheField;
    }

    public int setYearsOfComExperience(int yearsOfComExperience) {
        if (yearsOfComExperience < 0 || yearsOfComExperience >= 100) {
            throw new IllegalArgumentException("Number of years of commercial experience is incorrect");
        } else {
            this.yearsOfComExperience = yearsOfComExperience;
        }
        return (yearsOfComExperience);
    }

    public void setHasComExperienceInTheField(boolean previouslyFinishedThisSchool) {
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        if (hasComExperienceInTheField) {
            System.out.println("Previous Commercial Experience tn the same IT-Field" + " :: " + hasComExperienceInTheField);
            System.out.println("Please enter number of years of Commercial Experience");
            setYearsOfComExperience(yearsOfComExperience);
        } else {
            System.out.println("Previous Commercial Experience tn the same IT-Field" + " :: " + hasComExperienceInTheField);
            setYearsOfComExperience(0);
        }
    }

    public void experience() {
        System.out.println("Previous experience in the related IT-Field is :: " + yearsOfComExperience + " years");
    }
}