import com.example.school.Student;
import com.example.school.additional.EnglishLevel;
import com.example.school.section.Dev;
import com.example.school.section.PM;
import com.example.school.section.QA;
import com.example.school.section.UIUX;
import com.example.school.section.course.AQA_Java;
import com.example.school.section.course.AQA_JavaBuilder;

public class Main {
    public static void main(String[] args) {

        PM id1100_001 = new PM(1, "Anna", "+18007584412", "anna@example.com", true, 10, "" + EnglishLevel.B1_INTERMEDIATE, true);
        PM id1100_002 = new PM(2, "Brook", "+18008542502", "brook@sample.net", false, 0, "" + EnglishLevel.A1_BASIC, true);
        PM id1100_003 = new PM(3, "Claus", "+18602584697", "claus@example.com", false, 0, "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
        PM id1100_004 = new PM(4, "Derek", "+18508879903", "derek@example.com", false, 0, "" + EnglishLevel.B2_UPPER_INTERMEDIATE, false);
        Dev id1200_225 = new Dev(225, "Alice", "+16501203345", "alice@example.com",true, 10, "" + EnglishLevel.B2_UPPER_INTERMEDIATE, true);
        Dev id1200_226 = new Dev(226, "Bob", "+1870854112283", "bob@sample.net", true, 10, "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
        Dev id1200_227 = new Dev(227, "Charles", "+16801254679", "charles@mynet.com",false, 0, "" + EnglishLevel.B2_UPPER_INTERMEDIATE, true);
        UIUX id1300_338 = new UIUX(338, "Io", "+18003056478", "io@mynet.com", false, 0, "" + EnglishLevel.C1_ADVANCED, true);
        UIUX id1300_339 = new UIUX(339, "John", "+18205463321", "john@sample.net", false, 0, "" + EnglishLevel.B1_INTERMEDIATE, true);
        QA id1400_511 = new QA(511, "Kennet", "+18604005067", "kennet@mynet.com", false, 0, "com.example.school.section.QA", "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
        QA id1400_512 = new QA(512, "Lianne", "+16801203334", "lianne@example.com",false, 0, "com.example.school.section.QA", "" + EnglishLevel.B1_INTERMEDIATE, true);
        AQA_Java id1400_571 = new AQA_JavaBuilder().setStudentId(571).setStudentName("Michael").setStudentPhone("+13800021549").setStudentMail("michael@wexample.com").setPreviouslyFinishedThisSchool(false).setDiscount(0).setFieldQA("com.example.school.section.QA").setEnglishLevel(""+EnglishLevel.C1_ADVANCED).setWeekendIsSuitable(true).setHasComExperienceInTheField(true).setYearsOfComExperience(2).createAQA_Java();

        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("D I S C O U N T   P R O G R A M :");
        System.out.println("Students, who have been finished one of our courses before - get 10% discount!");
        System.out.println();

        //implement an Array of students;
        Student[] allStudents = {
                id1100_001,
                id1100_002,
                id1100_003,
                id1100_004,
                id1200_225,
                id1200_226,
                id1200_227,
                id1300_338,
                id1300_339,
                id1400_511,
                id1400_512,
                id1400_571
        };

        // Implement the loop, for check and printout those students, who previously finished this IT school;
        for (Student student : allStudents) {
            if (student.previouslyFinishedThisSchool) {
                System.out.println("Student ID " + student.getStudentId() + " (" + student.getStudentName() + ") has a Discount: " + student.getDiscount() + "%");
            }
        }

        System.out.println("************************************************************************************");
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("C O U R S E S   A V A I L A B L E   I N   E A C H   I T   F I E L D");
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
        System.out.println("************************************************************************************");
        System.out.println();

        System.out.println("************************************************************************************");
        System.out.println("M I S C   I N F O   A B O U T   S T U D E N T S  //CHECK PARENT-CHILD CLASS RELATIONS");
        System.out.println();
        System.out.println("INFO ABOUT PERSON id1400_512");
        System.out.print("Is the person is Student of the mySchool? :: ");
        System.out.println(id1400_512 instanceof Student);
        System.out.print("Is the person in QA field? :: ");
        System.out.println(id1400_512 instanceof QA);
        System.out.println();

        System.out.println("INFO ABOUT PERSON id1400_571");
        System.out.print("Is the person is Student of the mySchool? :: ");
        System.out.println(id1400_571 instanceof Student);
        System.out.print("Is the person in QA field? :: ");
        System.out.println(id1400_571 instanceof QA);
        System.out.print("Is the person is studying on the AQA (Java) course? :: ");
        System.out.println(id1400_571 instanceof AQA_Java);
        System.out.println("************************************************************************************");
        System.out.println();

        // Use accessors, which were absent and then add to the subclass "com.example.school.section.course.AQA_Java" acc. to the tutor remark //
        System.out.println("************************************************************************************");
        System.out.println("S T U D E N T   I N   A Q A   J A V A   C O U R S E //USING OF ACCESSORS FROM SUB-CLASS");
        System.out.println();
        System.out.println("What is name and previous experience of the Student id1400_571 ?");
        System.out.println("Student name is :: " + id1400_571.getStudentName());
        id1400_571.experience();
        System.out.println("Relevant IT-Field :: " + id1400_571.getFieldQA());
        System.out.println("************************************************************************************");
        System.out.println();

        System.out.println("************************************************************************************");
        System.out.println("E N G L I S H   G R O U P S   F O R   S T U D E N T S   //USING INTERFACES AND ENUMS");
        System.out.println();
        System.out.println(" ---------------------------------- R U L E S : ---------------------------------- ");
        System.out.println("PM-students and UI/UX-students been appointed to the Groups 1,2 and use the same interface");
        System.out.println("Dev-students and QA-students been appointed to the Groups 3,4 and use the same interface");
        System.out.println(" --------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" ----------------------------------- PM field ----------------------------------- ");
        System.out.println("My student ID is id1100_002 - Which English Group has been appointed to me?");
        id1100_002.saturdayEnglishGroup("");
        System.out.println();

        System.out.println("My student ID is id1100_003 - Which English Group has been appointed to me?");
        id1100_003.sundayEnglishGroup("");
        System.out.println(" --------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" ----------------------------------- DEV field ----------------------------------- ");
        System.out.println("My student ID is id1200_226 - Which English Group has been appointed to me?");
        id1200_226.saturdayEnglishGroup("");
        System.out.println();

        System.out.println("WMy student ID is id1200_227 - Which English Group has been appointed to me?");
        id1200_227.sundayEnglishGroup("");
        System.out.println(" --------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" ---------------------------------- UX/UI field ---------------------------------- ");
        System.out.println("My student ID is id1300_338 - Which English Group has been appointed to me?");
        id1300_338.saturdayEnglishGroup("");
        System.out.println();

        System.out.println("My student ID is id1300_339 - Which English Group has been appointed to me?");
        id1300_339.sundayEnglishGroup("");
        System.out.println(" --------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" ----------------------------------- QA field ----------------------------------- ");
        System.out.println("My student ID is id1400_511 - Which English Group has been appointed to me?");
        id1400_511.saturdayEnglishGroup("");
        System.out.println();

        System.out.println("My student ID is id1400_512 - Which English Group has been appointed to me?");
        id1400_512.sundayEnglishGroup("");
        System.out.println(" --------------------------------------------------------------------------------- ");
        System.out.println("************************************************************************************");
        System.out.println();

        System.out.println("************************************************************************************");
        System.out.println("E N G L I S H   L E V E L   A N D   S C H E D U L E  //USING VARS FROM THE INTERFACE");
        System.out.println();
        System.out.println("What is the name of the Student id1100_001 ?");
        System.out.println("What is the english level of the Student id1100_001 ?");
        System.out.println("Is the student available at weekends for the English Courses?");
        System.out.println("Student name is :: " + id1100_001.getStudentName());
        System.out.println("English level is :: " + id1100_001.englishLevel);
        System.out.println("Available at weekends :: " + id1100_001.weekendIsSuitable);
        System.out.println();

        System.out.println("What is the name of the Student id1100_004 ?");
        System.out.println("What is the english level of the Student id1100_004 ?");
        System.out.println("Is the student available at weekends for the English Courses?");
        System.out.println("Student name is :: " + id1100_004.getStudentName());
        System.out.println("English level is :: " + id1100_004.englishLevel);
        System.out.print("Available at weekends :: " + id1100_004.weekendIsSuitable + " -> ");
        id1100_004.eveningEnglishGroup();
        System.out.println("************************************************************************************");
        System.out.println();

        System.out.println("************************************************************************************");
        System.out.println("S H O W   P R O P E R T I E S   F O R    C O U R S E S // USING STRING BUILDER");
        System.out.println();

        System.out.println(" ----------- 1st variant \"String Concat (+)\" - class: \"AQA_JavaBuilder\"------------- ");
        // At Class "AQA_JavaBuilder" Generates String.Builder using 1st variant "String Concat (+)"
        var aqaJavaToS = new AQA_JavaBuilder(); // declaration of var "aqaJavaToS" and initialization it = StringBuilder "AQA_JavaBuilder"
        System.out.println(aqaJavaToS); // printout StringBuilder "AQA_JavaBuilder" via var "aqaJavaToS"
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" -------- 2nd variant \"String Concat (+) and super.toString()\" - class: \"QA\"-------- ");
        // At Class "QA" Generates String.Builder using 2nd variant "String Concat (+) and super.toString()"
        // In the line below needs to fill in the  QA() constructor with default "empty" values
        QA qaToS = new QA(0, "", "", "", false, 0, "", "", false);
        System.out.println(qaToS);
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" -------------------- 3rd variant \"StringBuffer\" - class: \"Dev\"--------------------- ");
        // At Class "Dev" Generates String.Builder using 3rd variant "StringBuffer"
        // In the line below needs to fill in the  Dev() constructor with default "empty" values
        var devToS = new Dev(0, "", "", "", false, 0, "", false);
        System.out.println(devToS);
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" -------------- 4th variant \"StringBuilder (JDK 1.5)\" - class: \"UIUX\"--------------- ");
        // At Class "UIUX" Generates String.Builder using 4th variant "StringBuilder (JDK 1.5)"
        // In the line below needs to fill in the UIUX() constructor with default "empty" values
        var uiuxToS = new UIUX(0, "", "", "", false, 0, "", false);
        System.out.println(uiuxToS);
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println();

        System.out.println(" --------------- 5th variant \"StringJoiner (JDK 1.8)\" - class: \"PM\"----------------- ");
        // At Class "PM" Generates String.Builder using 5th variant "StringJoiner (JDK 1.8)"
        // In the line below needs to fill in the PM() constructor with default "empty" values
        var pmToS = new PM(0, "", "", "", false, 0, "", false);
        System.out.println(pmToS);
        System.out.println(" ----------------------------------------------------------------------------------- ");
        System.out.println("************************************************************************************");
        System.out.println();
    }
}