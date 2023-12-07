public interface EnglishCourse {
    String englishLevel = null;
    boolean weekendIsSuitable = true;

    void saturdayEnglishGroup(String satEnglishMessage);

    void sundayEnglishGroup (String sunEnglishMessage);
    default void eveningEnglishGroup(){
        if(!weekendIsSuitable){
            System.out.println("Please, wait on your assignment to the one of English groups");
        } else {
            System.out.println("FYI: evening English Group is also available on Fridays 8:00-9:00 PM PST");
        }
    }
}
