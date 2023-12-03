public class PM extends Student { // create new sub-class "PM", which extends super-class "Students"
    String fieldPM;

    public PM(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount)
    {super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);}
    //implement constructor, which create the instance of "PM"-class

    public String getFieldPM() {
        return fieldPM;
    }
    // implements getter for the field "fieldQA" for get any String-type argument from this field;

    public void setFieldPM(String fieldPM) {
        this.fieldPM = fieldPM;
    }
    // implements setter for the field "fieldPM" for set any String-type argument;

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1100.Project Management");
        // implement annotation, which redefines corresponding method "message" in the super-class
    }
}
