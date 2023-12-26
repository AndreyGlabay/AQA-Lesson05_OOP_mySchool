// NEW BRANCH STREAMS
import com.example.school.Student;
import com.example.school.additional.EnglishLevel;
import com.example.school.section.Dev;
import com.example.school.section.PM;
import com.example.school.section.QA;
import com.example.school.section.UIUX;
import java.io.File;                        // auto import, when input to the Scanner object with type "file"
import java.io.FileNotFoundException;       // auto import
import java.util.ArrayList;                 // auto import
import java.util.Arrays;                    // auto import
import java.util.NoSuchElementException;    // auto import
import java.util.Scanner;                   // auto import

public class Main {

    private static final String FILE_NAME = "resources/students.csv"; // add the constant FILE_NAME which has property of file, that should be read

    static String[] readFileUsingScanner(String fileName){  // add static method, which read a file using scanner return String Array;
        ArrayList<String> data = new ArrayList<>();         // implement ArrayList for realize the possibility to add new line to the "empty" Array;
        var file = new File(fileName);                      // create an object with type "file";
        Scanner scanner = null;                             // take "Scanner" out of TRY/CATCH;
        try {                                               // surround the function with TRY/CATCH;
            scanner = new Scanner(file);                    // input file to the Scanner;
        } catch (FileNotFoundException e) {                 // if catch the exemption ->
            throw new RuntimeException(e);                  // -> run RuntimeException(e);
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

    // all implementations made above allows to have inside "data" - all the data needed;
    public static void main(String[] args) {
        String[] data = readFileUsingScanner(FILE_NAME);    // array's data is data from file FILE_NAME
        System.out.println(data);                           // output data -> but only Object's name and address;

        for (int i = 1; i < data.length; i++) {             // implements the "for" loop for array's line by line traverse;
            var pieces = data[i].split(";");          // split the array to the lines: if there is no regex ";" - method return the line -> then put the function into var "pieces";
            Student student = null;                         // implements the Object "student"
            switch (pieces[6].toLowerCase()) {              // implements SWITCH statement, which get element with index = 6 (englishLevel) + transform data to the lower case;
                case "pm":                                  // implements case for students studying PM field
                    student = new PM(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "dev": // implements case for students studying Dev field
                    student = new Dev(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "uiux":  // implements case for students studying UI/UX field
                    student = new UIUX(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "qa":  // implements case for students studying QA field
                    student = new QA(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
            }
            System.out.println("\"My School\" student in their IT-field: " + student);  // printout String from file "students.csv"
        }
        System.out.println();

        System.out.println("FYI: the List of pre-defined English levels:");
        for (com.example.school.additional.EnglishLevel level : EnglishLevel.values()) {
            System.out.println("* " + level);
        }
    }
}