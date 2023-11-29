public class UIUX extends Students {
    String fieldUIUX;

    public UIUX(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount)
    {super(studentId, studentName, previouslyFinishedThisSchool, discount);}

    public String getFieldUIUX() {
        return fieldUIUX;
    }

    public void setFieldUIUX(String fieldUIUX) {
        this.fieldUIUX = fieldUIUX;
    }

    @Override
    void message(){System.out.println("There are available Courses: 1300.UI/UX designer");}
}
