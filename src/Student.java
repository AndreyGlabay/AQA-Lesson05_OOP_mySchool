public abstract class Student { // create new super-class "Students"
    private final int studentId; //(*) see comment below
    private final String studentName;
    private String studentPhone;
    private String studentMail;
    private boolean previouslyFinishedThisSchool;
    private int discount;
    // Implement vars with access modifier "private" (access only in this class);
    // (*) Access modifier "final" - possibility to set var property only one time

    public Student(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount) {
        this.studentId = studentId;
        this.studentName = studentName;
        setPreviouslyFinishedThisSchool(previouslyFinishedThisSchool);
        setDiscount(discount);
    }
    //implement constructor, which create the instance of "Students"-class

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
// implements function with operator "if-else" : if the student finished courses before - give to them 10% discount

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    // implements accessor (setter) for var "discount"

    void message() {System.out.println("There are available Courses: _______");}
    // implements method "message" which return example of first part of the message
}