public class PM extends Student implements EnglishCourse { // implements "EnglishCourse" interface
    String fieldPM;

    public PM(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
    }

    public String getFieldPM() {
        return fieldPM;
    }

    public void setFieldPM(String fieldPM) {
        this.fieldPM = fieldPM;
    }

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1100.Project Management");
    }


    @Override //add annotation for override "saturdayEnglishGroup()" method
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + satEnglishMessage + "! Your lessons will be each Saturday 11:00-12:00 AM PST");
    }

    @Override //add annotation for override "sundayEnglishGroup()" method
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + sunEnglishMessage + "! Your lessons will be each Sunday 3:00-4:00 PM PST");
    }
}
