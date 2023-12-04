public class Main { //implement class "Main"
    public static void main(String[] args) {
        System.out.println();
        System.out.println("D I S C O U N T   P R O G R A M :");
        System.out.println("Students, who have been finished one of our courses before - get 10% discount!");
        System.out.println();

        PM id1100_001 = new PM(1, "Anna", "+18007584412", "anna@example.com", true, 10, "" + EnglishLevel.B1_INTERMEDIATE, true);
        PM id1100_002 = new PM(2, "Brook", "+18008542502", "brook@sample.net", false, 0, "" + EnglishLevel.A1_BASIC, true);
        PM id1100_003 = new PM(3, "Claus", "+18602584697", "claus@example.com", false, 0, "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
        Dev id1200_225 = new Dev(225, "Alice", "+16501203345", "alice@example.com",true, 10);
        Dev id1200_226 = new Dev(226, "Bob", "+1870854112283", "bob@sample.net", true, 10);
        Dev id1200_227 = new Dev(227, "Charles", "+16801254679", "charles@mynet.com",false, 0);
        UIUX id1300_338 = new UIUX(338, "Io", "+18003056478", "io@mynet.com", false, 0);
        UIUX id1300_339 = new UIUX(339, "John", "+18205463321", "john@sample.net", false, 0);
        QA id1400_511 = new QA(511, "Kennet", "+18604005067", "kennet@mynet.com", false, 0, "QA");
        QA id1400_512 = new QA(512, "Lianne", "+16801203334", "lianne@example.com",false, 0, "QA");
        AQA_Java id1400_571 = new AQA_JavaBuilder().setStudentId(571).setStudentName("Michael").setStudentPhone("+13800021549").setStudentMail("michael@wexample.com").setPreviouslyFinishedThisSchool(false).setDiscount(0).setFieldQA("QA").setHasComExperienceInTheField(true).setYearsOfComExperience(2).createAQA_Java();
        // The Line above ^ :: In the class "AQA_Java" - constructor "AQA_Java" has been replaced with builder "AQA_JavaBuilder"

        System.out.println();
        System.out.println("Student id1400_511 (" + id1400_511.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1400_511.message();
        System.out.println();
        System.out.println("Student id1100_002 (" + id1100_002.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1100_002.message();
        System.out.println();
        System.out.println("Student id1300_338 (" + id1300_338.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1300_338.message();
        System.out.println();
        System.out.println("Student id1200_225 (" + id1200_225.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1200_225.message();
        System.out.println();
        System.out.println();

        System.out.println("INFO ABOUT PERSON id1400_512");
        System.out.print("Is the person is Student? :: ");
        System.out.println(id1400_512 instanceof Student);
        System.out.print("Is the person in QA field? :: ");
        System.out.println(id1400_512 instanceof QA);
        System.out.println();

        System.out.println("INFO ABOUT PERSON id1400_571");
        System.out.print("Is the person is Student? :: ");
        System.out.println(id1400_571 instanceof Student);
        System.out.print("Is the person in QA field? :: ");
        System.out.println(id1400_571 instanceof QA);
        System.out.print("Is the person is studieng on AQA_Java course? :: ");
        System.out.println(id1400_571 instanceof AQA_Java);
        System.out.println();

        // Use accessors which were absent and then add to the subclass "AQA_Java" acc. to the tutor remark //
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println("What is name and previous experience of the Student id1400_571 ?");
        System.out.println("Student name is :: " + id1400_571.getStudentName());
        id1400_571.experience();
        System.out.println("Relevant IT-Field :: " + id1400_571.getFieldQA());
        System.out.println();

        // ********* LESSON-6 -> HOMEWORK-5 "Abstract classes and interfaces" ********* //
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println();

        // (FYI: PM-students and UI/UX-students been appointed to the Groups 1,2 and use same i/f)
        // (FYI: Dev-students and QA-students been appointed to the Groups 3,4 and use same i/f)

        // PM students //
        System.out.println(" --------------- PM field --------------- ");
        System.out.println();

        System.out.println("My student ID is id1100_002 - Which English Group has been appointed to me?");
        id1100_002.saturdayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();

        System.out.println("My student ID is id1100_003 - Which English Group has been appointed to me?");
        id1100_003.sundayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();
        System.out.println();

        // Dev students //
        System.out.println(" --------------- DEV field --------------- ");
        System.out.println();

        System.out.println("My student ID is id1200_226 - Which English Group has been appointed to me?");
        id1200_226.saturdayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();

        System.out.println("WMy student ID is id1200_227 - Which English Group has been appointed to me?");
        id1200_227.sundayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();
        System.out.println();

        // UI/UX students //
        System.out.println(" --------------- UX/UI field --------------- ");
        System.out.println();

        System.out.println("My student ID is id1300_338 - Which English Group has been appointed to me?");
        id1300_338.saturdayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();

        System.out.println("My student ID is id1300_339 - Which English Group has been appointed to me?");
        id1300_339.sundayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();
        System.out.println();

        // QA students //
        System.out.println(" --------------- QA field --------------- ");
        System.out.println();

        System.out.println("My student ID is id1400_511 - Which English Group has been appointed to me?");
        id1400_511.saturdayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();

        System.out.println("My student ID is id1400_512 - Which English Group has been appointed to me?");
        id1400_512.sundayEnglishGroup(""); // !!! Confusion with blank quotation after Enum implementation and interface string-type methods
        System.out.println();
        System.out.println();
    }
}
