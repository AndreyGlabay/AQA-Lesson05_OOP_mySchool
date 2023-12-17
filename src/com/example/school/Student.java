package com.example.school;

public abstract class Student {
    private final int studentId;
    private final String studentName;
    private String studentPhone;
    private String studentMail;
    public boolean previouslyFinishedThisSchool;
    private int discount;

    public Student(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.previouslyFinishedThisSchool = previouslyFinishedThisSchool;
        this.discount = discount;
    }

    public int getStudentId() {return studentId;}

    public String getStudentName() {return studentName;}

    public String getStudentPhone() {return studentPhone;}

    public String getStudentMail() {return studentMail;}

    public boolean isPreviouslyFinishedThisSchool() {return previouslyFinishedThisSchool;}

    public int getDiscount() {return discount;}

public void setPreviouslyFinishedThisSchool(boolean previouslyFinishedThisSchool) {
        this.previouslyFinishedThisSchool = previouslyFinishedThisSchool;
        if (previouslyFinishedThisSchool) {
            System.out.println(studentName + " :: " + "You have a 10% discount for the chosen Course!");
            setDiscount(10);
        } else {
           System.out.println(studentName + " :: " + "Unfortunately you don't have a discount for the chosen Course");
           setDiscount(0);
        }
}

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public abstract void message();
}