public class Students { // create new super-class
    private final int studentId;
    private final String studentFirstName;
    private final String studentLastName;
    private boolean previouslyFinishedThisSchool;
    private int discount;

    public Students(
            int studentId,
            String studentFirstName,
            String studentLastName,
            boolean previouslyFinishedThisSchool,
            short qtyOfPreviousCourses,
            int discount) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        setPreviouslyFinishedThisSchool(previouslyFinishedThisSchool);
        setDiscount(discount);
    }

    public int getStudentId() {return studentId;}

    public String getStudentFirstName() {return studentFirstName;}

    public String getStudentLastName() {return studentLastName;}

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