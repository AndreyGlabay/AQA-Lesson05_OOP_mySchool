public class QA extends Student { // create new sub-class "QA", which extends super-class "Students"
    String fieldQA;

    public QA(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount, String fieldQA) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.fieldQA = fieldQA;
    }
    //implement constructor, which create the instance of "QA"-class with additional field "fieldQA"

    public String getFieldQA() {
        return fieldQA;
    }
    // implements getter for the field "fieldQA" for get any String-type argument from this field;

    public void setFieldQA(String fieldQA) {
        this.fieldQA = fieldQA;
    }
    // implements setter for the field "fieldQA" for set any String-type argument;

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1400.QA Engineer Manual;");
        System.out.println("   1401.AQA Engineer (Java);");
        System.out.println("   1402.AQA Engineer (JavaScript);");
        System.out.println("   1403.AQA Engineer (Python);");
        // implement annotation, which redefines corresponding method "message" in the super-class
    }
}
