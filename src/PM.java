public class PM extends Students {
    String course;
    public PM(
            int studentId,
            String studentName,
            boolean previouslyFinishedThisSchool,
            int discount)
    {super(studentId, studentName, previouslyFinishedThisSchool, discount)}

    @Override
    void message(){System.out.println("There are available Courses: 1100.Project Manager");}
}
