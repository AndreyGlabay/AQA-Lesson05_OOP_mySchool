public class UIUX extends Student implements EnglishCourse { // implements "EnglishCourse" interface
    String fieldUIUX;

    public UIUX(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
    }

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

    @Override //add annotation for override "saturdayEnglishGroup()" method
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + satEnglishMessage + "! Your lessons will be each Saturday 11:00-12:00 AM PST");
    }

    @Override //add annotation for override "sundayEnglishGroup()" method
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + sunEnglishMessage + "! Your lessons will be each Sunday 3:00-4:00 PM PST");
    }
}
