public class AQA_Java extends QA {

    boolean hasComExperienceInTheField;
    int yearsOfComExperience;

    public AQA_Java(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount, String fieldQA) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount, fieldQA);
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        this.yearsOfComExperience = yearsOfComExperience;
    }
}
