public class QA extends Students {
    String fieldQA;

    public QA(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount, String fieldQA) {
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
}
