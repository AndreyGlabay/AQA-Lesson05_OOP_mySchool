public class UIUX extends Students {
    String course;
    public UIUX(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount)
    {super(studentId, studentName, previouslyFinishedThisSchool, discount)}

    @Override
    void message(){System.out.println("There are available Courses: 1300.UI/UX designer");}
}
