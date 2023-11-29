public abstract class Students { // create new super-class
    private final int studentId;
    private final String studentName;
    private boolean previouslyFinishedThisSchool;
    private int discount;


    public Students(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount) {
        this.studentId = studentId;
        this.studentName = studentName;
        setPreviouslyFinishedThisSchool(previouslyFinishedThisSchool);
        setDiscount(discount);
    }

    public int getStudentId() {return studentId;}

    public String getStudentName() {return studentName;}

    public boolean isPreviouslyFinishedThisSchool() {return previouslyFinishedThisSchool;}

    public int getDiscount() {return discount;}

public void setPreviouslyFinishedThisSchool(boolean previouslyFinishedThisSchool) {
        this.previouslyFinishedThisSchool = previouslyFinishedThisSchool;
        if (previouslyFinishedThisSchool) {
            System.out.println("You have a 10% discount for the chosen Course!");
            setDiscount(10);
        } else {
           System.out.println("Unfortunately you don't have discount for the your Course");
           setDiscount(0);
        }
}

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    void message() {System.out.println("There are available Courses: _______");}

}