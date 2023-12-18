import com.example.school.Student;
import com.example.school.additional.EnglishLevel;
import com.example.school.section.Dev;
import com.example.school.section.PM;
import com.example.school.section.QA;
import com.example.school.section.UIUX;
//import com.example.school.section.course.AQA_Java;
//import com.example.school.section.course.AQA_JavaBuilder;

import java.io.File; // auto import, when input to the Scanner object with type "file"
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static final String FILE_NAME = "resources/students.csv"; // add the constant FILE_NAME which has property of file, that should be read

    static String[] readFileUsingScanner(String fileName){  // add static method, which read a file using scanner return String Array;
        ArrayList<String> data = new ArrayList<>();         // implement ArrayList for realize the possibility to add new line to the "empty" Array;
        var file = new File(fileName);                      // create an object with type "file";
        Scanner scanner = null;                             // take "Scanner" out of TRY/CATCH;
        try {                                               // surround the function with TRY/CATCH;
            scanner = new Scanner(file);                    // input file to the Scanner;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        boolean finished = false;                           // implement boolean var "finished", which has property "false" so far as there is smth to read
        do {                                                // implement DO-WHILE loop, and put to it scanner's method nextLine();
            try {                                           // surround the nextLine() method with TRY/CATCH
                data.add(scanner.nextLine());               // implement var "nextLine" = scanner method "nextLine()", which return next string line; -> then change var to the ArrayList "add" method;
            } catch (NoSuchElementException e) {            // exception for case if no more lines in the nextLine();
                finished = true;                            // when the exception been caught - change "finished" property to the "true"
            }
        } while (!finished);

        scanner.close();                                                    // close the "Scanner";
        return Arrays.copyOf(data.toArray(), data.size(), String[].class);  // return array from string from ArrayList;
    };

    public static void main(String[] args) {
        // With the help of all above implementation - we will have inside "data" all the data needed;
        String[] data = readFileUsingScanner(FILE_NAME);    // inside main() array's data is data from file FILE_NAME
        System.out.println(data);                           // output data -> but only Object's name and address;

        for (int i = 1; i < data.length; i++) {             // implements the "for" loop for array's line by line traverse;
            var pieces = data[i].split(";");          // split the array to the lines: if there is no regex ";" - method return the line -> then put the function into var "pieces";
            Student student = null;                         // implements the Object "student"

            switch (pieces[6].toLowerCase()) {              // implements SWITCH statement, which get element with index = 6 (englishLevel) + transform data to the lower case;
                case "pm":                                  // implements case for students studying PM field
                    student = new PM(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3], Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7], Boolean.parseBoolean(pieces[8]));
                    break;
                case "dev":                                  // implements case for students studying Dev field
                    student = new Dev(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3], Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7], Boolean.parseBoolean(pieces[8]));
                    break;
                case "uiux":                                  // implements case for students studying UI/UX field
                    student = new UIUX(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3], Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7], Boolean.parseBoolean(pieces[8]));
                    break;
                case "qa":                                  // implements case for students studying QA field
                    student = new QA(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3], Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7], Boolean.parseBoolean(pieces[8]));
                    break;
            }
            System.out.println(student); // printout String from file "students.csv"
        }




        // ******************************* HIDES PREVIOUS LESSONS' TASKS TO THE COMMENTS *******************************

//        PM id1100_001 = new PM(1, "Anna", "+18007584412", "anna@example.com", true, 10, "" + EnglishLevel.B1_INTERMEDIATE, true);
//        PM id1100_002 = new PM(2, "Brook", "+18008542502", "brook@sample.net", false, 0, "" + EnglishLevel.A1_BASIC, true);
//        PM id1100_003 = new PM(3, "Claus", "+18602584697", "claus@example.com", false, 0, "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
//        PM id1100_004 = new PM(4, "Derek", "+18508879903", "derek@example.com", false, 0, "" + EnglishLevel.B2_UPPER_INTERMEDIATE, false);
//        Dev id1200_225 = new Dev(225, "Alice", "+16501203345", "alice@example.com",true, 10, "" + EnglishLevel.B2_UPPER_INTERMEDIATE, true);
//        Dev id1200_226 = new Dev(226, "Bob", "+1870854112283", "bob@sample.net", true, 10, "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
//        Dev id1200_227 = new Dev(227, "Charles", "+16801254679", "charles@mynet.com",false, 0, "" + EnglishLevel.B2_UPPER_INTERMEDIATE, true);
//        UIUX id1300_338 = new UIUX(338, "Io", "+18003056478", "io@mynet.com", false, 0, "" + EnglishLevel.C1_ADVANCED, true);
//        UIUX id1300_339 = new UIUX(339, "John", "+18205463321", "john@sample.net", false, 0, "" + EnglishLevel.B1_INTERMEDIATE, true);
//        QA id1400_511 = new QA(511, "Kennet", "+18604005067", "kennet@mynet.com", false, 0, "com.example.school.section.QA", "" + EnglishLevel.A2_PRE_INTERMEDIATE, true);
//        QA id1400_512 = new QA(512, "Lianne", "+16801203334", "lianne@example.com",false, 0, "com.example.school.section.QA", "" + EnglishLevel.B1_INTERMEDIATE, true);
//        AQA_Java id1400_571 = new AQA_JavaBuilder().setStudentId(571).setStudentName("Michael").setStudentPhone("+13800021549").setStudentMail("michael@wexample.com").setPreviouslyFinishedThisSchool(false).setDiscount(0).setFieldQA("com.example.school.section.QA").setEnglishLevel(""+EnglishLevel.C1_ADVANCED).setWeekendIsSuitable(true).setHasComExperienceInTheField(true).setYearsOfComExperience(2).createAQA_Java();
//
//        System.out.println();
//        System.out.println("************************************************************************************");
//        System.out.println("D I S C O U N T   P R O G R A M :");
//        System.out.println("Students, who have been finished one of our courses before - get 10% discount!");
//        System.out.println();
//
//        Student[] allStudents = {
//                id1100_001,
//                id1100_002,
//                id1100_003,
//                id1100_004,
//                id1200_225,
//                id1200_226,
//                id1200_227,
//                id1300_338,
//                id1300_339,
//                id1400_511,
//                id1400_512,
//                id1400_571
//        };
//
//        for (Student student : allStudents) {
//            if (student.previouslyFinishedThisSchool) {
//                System.out.println("Student ID " + student.getStudentId() + " (" + student.getStudentName() + ") has a Discount: " + student.getDiscount() + "%");
//            }
//        }
//
//        System.out.println("************************************************************************************");
//        System.out.println();
//        System.out.println("************************************************************************************");
//        System.out.println("C O U R S E S   A V A I L A B L E   I N   E A C H   I T   F I E L D");
//        System.out.println();
//        System.out.println("Student id1400_511 (" + id1400_511.getStudentName() + ") like to know which courses are available in their IT-Field?");
//        id1400_511.message();
//        System.out.println();
//        System.out.println("Student id1100_002 (" + id1100_002.getStudentName() + ") like to know which courses are available in their IT-Field?");
//        id1100_002.message();
//        System.out.println();
//        System.out.println("Student id1300_338 (" + id1300_338.getStudentName() + ") like to know which courses are available in their IT-Field?");
//        id1300_338.message();
//        System.out.println();
//        System.out.println("Student id1200_225 (" + id1200_225.getStudentName() + ") like to know which courses are available in their IT-Field?");
//        id1200_225.message();
//        System.out.println("************************************************************************************");
//        System.out.println();
//
//        System.out.println("************************************************************************************");
//        System.out.println("M I S C   I N F O   A B O U T   S T U D E N T S  //CHECK PARENT-CHILD CLASS RELATIONS");
//        System.out.println();
//        System.out.println("INFO ABOUT PERSON id1400_512");
//        System.out.print("Is the person is Student of the mySchool? :: ");
//        System.out.println(id1400_512 instanceof Student);
//        System.out.print("Is the person in QA field? :: ");
//        System.out.println(id1400_512 instanceof QA);
//        System.out.println();
//
//        System.out.println("INFO ABOUT PERSON id1400_571");
//        System.out.print("Is the person is Student of the mySchool? :: ");
//        System.out.println(id1400_571 instanceof Student);
//        System.out.print("Is the person in QA field? :: ");
//        System.out.println(id1400_571 instanceof QA);
//        System.out.print("Is the person is studying on the AQA (Java) course? :: ");
//        System.out.println(id1400_571 instanceof AQA_Java);
//        System.out.println("************************************************************************************");
//        System.out.println();
//
//        System.out.println("************************************************************************************");
//        System.out.println("S T U D E N T   I N   A Q A   J A V A   C O U R S E //USING OF ACCESSORS FROM SUB-CLASS");
//        System.out.println();
//        System.out.println("What is name and previous experience of the Student id1400_571 ?");
//        System.out.println("Student name is :: " + id1400_571.getStudentName());
//        id1400_571.experience();
//        System.out.println("Relevant IT-Field :: " + id1400_571.getFieldQA());
//        System.out.println("************************************************************************************");
//        System.out.println();
//
//        System.out.println("************************************************************************************");
//        System.out.println("E N G L I S H   G R O U P S   F O R   S T U D E N T S   //USING INTERFACES AND ENUMS");
//        System.out.println();
//        System.out.println(" ---------------------------------- R U L E S : ---------------------------------- ");
//        System.out.println("PM-students and UI/UX-students been appointed to the Groups 1,2 and use the same interface");
//        System.out.println("Dev-students and QA-students been appointed to the Groups 3,4 and use the same interface");
//        System.out.println(" --------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" ----------------------------------- PM field ----------------------------------- ");
//        System.out.println("My student ID is id1100_002 - Which English Group has been appointed to me?");
//        id1100_002.saturdayEnglishGroup("");
//        System.out.println();
//
//        System.out.println("My student ID is id1100_003 - Which English Group has been appointed to me?");
//        id1100_003.sundayEnglishGroup("");
//        System.out.println(" --------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" ----------------------------------- DEV field ----------------------------------- ");
//        System.out.println("My student ID is id1200_226 - Which English Group has been appointed to me?");
//        id1200_226.saturdayEnglishGroup("");
//        System.out.println();
//
//        System.out.println("WMy student ID is id1200_227 - Which English Group has been appointed to me?");
//        id1200_227.sundayEnglishGroup("");
//        System.out.println(" --------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" ---------------------------------- UX/UI field ---------------------------------- ");
//        System.out.println("My student ID is id1300_338 - Which English Group has been appointed to me?");
//        id1300_338.saturdayEnglishGroup("");
//        System.out.println();
//
//        System.out.println("My student ID is id1300_339 - Which English Group has been appointed to me?");
//        id1300_339.sundayEnglishGroup("");
//        System.out.println(" --------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" ----------------------------------- QA field ----------------------------------- ");
//        System.out.println("My student ID is id1400_511 - Which English Group has been appointed to me?");
//        id1400_511.saturdayEnglishGroup("");
//        System.out.println();
//
//        System.out.println("My student ID is id1400_512 - Which English Group has been appointed to me?");
//        id1400_512.sundayEnglishGroup("");
//        System.out.println(" --------------------------------------------------------------------------------- ");
//        System.out.println("************************************************************************************");
//        System.out.println();
//
//        System.out.println("************************************************************************************");
//        System.out.println("E N G L I S H   L E V E L   A N D   S C H E D U L E  //USING VARS FROM THE INTERFACE");
//        System.out.println();
//        System.out.println("What is the name of the Student id1100_001 ?");
//        System.out.println("What is the english level of the Student id1100_001 ?");
//        System.out.println("Is the student available at weekends for the English Courses?");
//        System.out.println("Student name is :: " + id1100_001.getStudentName());
//        System.out.println("English level is :: " + id1100_001.englishLevel);
//        System.out.println("Available at weekends :: " + id1100_001.weekendIsSuitable);
//        System.out.println();
//
//        System.out.println("What is the name of the Student id1100_004 ?");
//        System.out.println("What is the english level of the Student id1100_004 ?");
//        System.out.println("Is the student available at weekends for the English Courses?");
//        System.out.println("Student name is :: " + id1100_004.getStudentName());
//        System.out.println("English level is :: " + id1100_004.englishLevel);
//        System.out.print("Available at weekends :: " + id1100_004.weekendIsSuitable + " -> ");
//        id1100_004.eveningEnglishGroup();
//        System.out.println("************************************************************************************");
//        System.out.println();

//        System.out.println("************************************************************************************");
//        System.out.println("S H O W   P R O P E R T I E S   F O R    C O U R S E S // USING STRING BUILDER");
//        System.out.println();
//
//        System.out.println(" ----------- 1st variant \"String Concat (+)\" - class: \"AQA_JavaBuilder\"------------- ");
//        var aqaJavaToS = new AQA_JavaBuilder();
//        System.out.println(aqaJavaToS);
//        System.out.println(" ----------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" -------- 2nd variant \"String Concat (+) and super.toString()\" - class: \"QA\"-------- ");
//        QA qaToS = new QA(0, "", "", "", false, 0, "", "", false);
//        System.out.println(qaToS);
//        System.out.println(" ----------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" -------------------- 3rd variant \"StringBuffer\" - class: \"Dev\"--------------------- ");
//        var devToS = new Dev(0, "", "", "", false, 0, "", false);
//        System.out.println(devToS);
//        System.out.println(" ----------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" -------------- 4th variant \"StringBuilder (JDK 1.5)\" - class: \"UIUX\"--------------- ");
//        var uiuxToS = new UIUX(0, "", "", "", false, 0, "", false);
//        System.out.println(uiuxToS);
//        System.out.println(" ----------------------------------------------------------------------------------- ");
//        System.out.println();
//
//        System.out.println(" --------------- 5th variant \"StringJoiner (JDK 1.8)\" - class: \"PM\"----------------- ");
//        var pmToS = new PM(0, "", "", "", false, 0, "", false);
//        System.out.println(pmToS);
//        System.out.println(" ----------------------------------------------------------------------------------- ");
//        System.out.println("************************************************************************************");
//        System.out.println();

    }
}