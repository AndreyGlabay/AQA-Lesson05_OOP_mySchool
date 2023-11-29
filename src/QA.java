public class QA extends Students {
    String fieldQA;

    public Dev(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount)
    {super(studentId, studentName, previouslyFinishedThisSchool, discount)}

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1400.QA Engineer Manual;");
        System.out.println("   1401.AQA Engineer (Java);");
        System.out.println("   1402.AQA Engineer (JavaScript);");
        System.out.println("   1403.AQA Engineer (Python);");
    }
}
