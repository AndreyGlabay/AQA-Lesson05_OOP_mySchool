public abstract class Students { // create new super-class
    private final int studentId;
    private final String studentName;
    private String studentPhone;
    private String studentMail;
    private boolean previouslyFinishedThisSchool;
    private int discount;


    public Students(
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

    void message() {System.out.println("There are available Courses: _______");}

}