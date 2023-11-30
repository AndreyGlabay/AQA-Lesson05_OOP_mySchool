public class AQA_Java extends QA { // create new sub-class "AQA_Java", which extends parent-class "QA"

    boolean hasComExperienceInTheField;
    int yearsOfComExperience;
    // add new variables especially for this class

    public AQA_Java(int studentId, String studentName, String studentPhone, String studentMail, boolean previouslyFinishedThisSchool, int discount, String fieldQA) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount, fieldQA);
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        this.yearsOfComExperience = yearsOfComExperience;
    }
}
//implement constructor, which create the instance of "AQA_Java"-class with additional fields