public class AQA_Java extends QA { // create new sub-class "AQA_Java", which extends parent-class "QA"

    boolean hasComExperienceInTheField;
    int yearsOfComExperience;
    // add new variables especially for this class

    public AQA_Java(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String fieldQA,
            boolean hasComExperienceInTheField,
            int yearsOfComExperience) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount, fieldQA);
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        this.yearsOfComExperience = yearsOfComExperience;
    }
    //implement constructor, which create the instance of "AQA_Java"-class with additional fields

    public boolean isHasComExperienceInTheField() {
        return hasComExperienceInTheField;
    }

    public int setYearsOfComExperience(int yearsOfComExperience) {
        if (yearsOfComExperience < 0 || yearsOfComExperience >= 100) {
            throw new IllegalArgumentException("Number of years of commercial experience is incorrect");
        } else {
            this.yearsOfComExperience = yearsOfComExperience;
        }
        return (yearsOfComExperience);
    }

    public void setHasComExperienceInTheField(boolean previouslyFinishedThisSchool) {
        this.hasComExperienceInTheField = hasComExperienceInTheField;
        if (hasComExperienceInTheField) {
            System.out.println("Previous Commercial Experience tn the same IT-Field" + " :: " + hasComExperienceInTheField);
            System.out.println("Please enter number of years of Commercial Experience");
            setYearsOfComExperience(yearsOfComExperience);
        } else {
            System.out.println("Previous Commercial Experience tn the same IT-Field" + " :: " + hasComExperienceInTheField);
            setYearsOfComExperience(0);
        }
    }

    void Experience() {
        System.out.println("Previous experience in the related IT-Field is :: " + yearsOfComExperience + " years");
    }
}
