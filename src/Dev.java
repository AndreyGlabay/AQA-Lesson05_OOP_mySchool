public class Dev extends Student implements EnglishCourse { // implements "EnglishCourse" interface
    String fieldDev;

    public Dev(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
    }
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
    @Override //add annotation for override "saturdayEnglishGroup()" method
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + satEnglishMessage + "! Your lessons will be each Saturday 12:00-1:00 PM PST");
    }

    @Override //add annotation for override "sundayEnglishGroup()" method
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + sunEnglishMessage + "! Your lessons will be each Sunday 4:00-5:00 PM PST");
    }
}
