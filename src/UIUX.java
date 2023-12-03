public class UIUX extends Student { // create new sub-class "UIUX", which extends super-class "Students"
    String fieldUIUX;

    public UIUX(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount)
    {super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);}
    //implement constructor, which create the instance of "UIUX"-class

    public String getFieldUIUX() {
        return fieldUIUX;
    }
    // implements getter for the field "fieldQA" for get any String-type argument from this field;

    public void setFieldUIUX(String fieldUIUX) {
        this.fieldUIUX = fieldUIUX;
    }
    // implements setter for the field "fieldUIUX" for set any String-type argument;

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1300.UI/UX designer");
        // implement annotation, which redefines corresponding method "message" in the super-class
    }
}
