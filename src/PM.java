public class PM extends Students {
    String fieldPM;

    public PM(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount)
    {super(studentId, studentName, previouslyFinishedThisSchool, discount);}

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
}
