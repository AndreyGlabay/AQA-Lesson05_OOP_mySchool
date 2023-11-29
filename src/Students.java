public class Students { // create new super-class
    private final int studentId;
    private final String studentName;
    private boolean previouslyFinishedThisSchool;
    private int discount;


    public Students(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            short qtyOfPreviousCourses,
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
        if (previouslyFinishedThisSchool = false) {
            throw new IllegalArgumentException("Unfortunately you don't have discount for the your Course");
        } else {
            this.discount = discount;
        }
}

void message() {System.out.println("There are available Courses: _______");}

}