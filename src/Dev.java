public class Dev extends Student implements EnglishCourse { // implements "EnglishCourse" interface
    String fieldDev;
    String englishLevel;
    boolean weekendIsSuitable;

    public Dev(
            int studentId,
            String studentName,
            String studentPhone,
            String studentMail,
            boolean previouslyFinishedThisSchool,
            int discount,
            String englishLevel,
            boolean weekendIsSuitable) {
        super(studentId, studentName, studentPhone, studentMail, previouslyFinishedThisSchool, discount);
        this.englishLevel = englishLevel;
        this.weekendIsSuitable = weekendIsSuitable;
    }

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

    @Override //add annotation for override "saturdayEnglishGroup()" method
    public void saturdayEnglishGroup(String satEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroups.Group_3 + "! Your lessons will be each Saturday 1:00-2:00 PM PST");
    }

    @Override //add annotation for override "sundayEnglishGroup()" method
    public void sundayEnglishGroup(String sunEnglishMessage) {
        System.out.println("Welcome to " + EnglishGroups.Group_4 + "! Your lessons will be each Sunday 6:00-7:00 PM PST");
    }
}
