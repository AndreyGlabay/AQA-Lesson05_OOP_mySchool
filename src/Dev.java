public class Dev extends Students { // create new sub-class "Dev", which extends super-class "Students"
    String fieldDev;

    public Dev(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount)
    {super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);}
    //implement constructor, which create the instance of "Dev"-class

    public String getFieldDev() {
        return fieldDev;
    }
    // implements getter for the field "fieldQA" for get any String-type argument from this field;


    public void setFieldDev(String fieldDev) {
        this.fieldDev = fieldDev;
    }
    // implements setter for the field "fieldDev" for set any String-type argument;

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1201.Software Developer (Java);");
        System.out.println("   1202.Software Developer (JavaScript);");
        System.out.println("   1203.Software Developer (Python);");
        // implement annotation, which redefines corresponding method "message" in the super-class
    }
}
