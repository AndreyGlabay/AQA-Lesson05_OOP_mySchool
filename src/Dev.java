public class Dev extends Students {
    String fieldDev;

    public Dev(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount)
    {super(studentId, studentName, previouslyFinishedThisSchool, discount);}

    public String getFieldDev() {
        return fieldDev;
    }

    public void setFieldDev(String fieldDev) {
        this.fieldDev = fieldDev;
    }

    @Override
    void message(){
        System.out.println("There are available Courses: ");
        System.out.println("   1201.Software Developer (Java);");
        System.out.println("   1202.Software Developer (JavaScript);");
        System.out.println("   1203.Software Developer (Python);");
    }
}
