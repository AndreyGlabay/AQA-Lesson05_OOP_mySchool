public class QA extends Student implements EnglishCourse {
    String fieldQA;
    String englishLevel;
    boolean weekendIsSuitable;

    public QA(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String fieldQA,
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.fieldQA = fieldQA;
    }

    public String getFieldQA() {
        return fieldQA;
    }

    public void setFieldQA(String fieldQA) {
        this.fieldQA = fieldQA;
    }

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1400.QA Engineer Manual;");
        System.out.println("   1401.AQA Engineer (Java);");
        System.out.println("   1402.AQA Engineer (JavaScript);");
        System.out.println("   1403.AQA Engineer (Python);");

    }

    @Override //add annotation for override "saturdayEnglishGroup()" method
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_3 + "! Your lessons will be each Saturday 1:00-2:00 PM PST");
    }

    @Override //add annotation for override "sundayEnglishGroup()" method
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroup.Group_4 + "! Your lessons will be each Sunday 6:00-7:00 PM PST");
    }
}
