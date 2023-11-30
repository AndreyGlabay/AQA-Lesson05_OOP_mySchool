public class UIUX extends Students {
    String fieldUIUX;

    public UIUX(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount)
    {super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);}

    public String getFieldUIUX() {
        return fieldUIUX;
    }

    public void setFieldUIUX(String fieldUIUX) {
        this.fieldUIUX = fieldUIUX;
    }

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1300.UI/UX designer");
    }
}
