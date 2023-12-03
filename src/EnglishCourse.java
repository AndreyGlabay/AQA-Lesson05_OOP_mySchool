public interface EnglishCourse {
    String englishLevel = null;
    boolean weekendIsSuitable = true;


    default void saturdayEnglishGroup(String satEnglishMessage) {

    }

    void sundayEnglishGroup (String sunEnglishMessage);



}
