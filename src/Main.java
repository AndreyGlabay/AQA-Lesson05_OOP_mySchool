import com.example.school.Student;
import com.example.school.additional.EnglishLevel;
import com.example.school.section.Dev;
import com.example.school.section.PM;
import com.example.school.section.QA;
import com.example.school.section.UIUX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException; // (step 2.2) import manually, when modify ArrayList to the LinkedList
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Stack; // (step 2.3) import manually for put all objects to the Stack

public class Main {

    private static final String FILE_NAME = "resources/students.csv";

    static String[] readFileUsingScanner(String fileName){
        LinkedList<String> data = new LinkedList<>(); // (step 2.2) change ArrayList to the LinkedList;
        var file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        boolean finished = false;
        do {
            try {
                data.add(scanner.nextLine());
            } catch (NoSuchElementException e) {
                finished = true;
            }
        } while (!finished);

        scanner.close();
        return data.toArray(new String[0]);
    };

    public static void main(String[] args) throws IOException {
        // (step 2.1) implements "List" interface (which is subclass for Collections) for ->
        //            -> students' set, with the empty list of the students
        List<Student> students = new LinkedList<>();
        String[] data = readFileUsingScanner(FILE_NAME);    // (step 2.1) read lines from the file
        createStudentObjects(data, students);               // (step 2.1) read objects from the lines
        Stream<Student> stream = students.stream();         // (step 2.1) create Stream from the objects

        Stack<Student> studentStack = new Stack<>();        // (step 2.3) modify List to the Stack;
        studentStack.addAll(students);                      // (step 2.3) add all elements from the List to the Stack;

        System.out.println("Elements in the Stack :");      // (step 2.3) check Stack functionality:
        while (!studentStack.isEmpty()) {                   // (step 2.3) until Stack is not empty ->
            System.out.println(studentStack.pop());         // (step 2.3) -> take of an element from the Stack and return it;
        }

        Stream<String> lines = Files.lines(Paths.get(FILE_NAME)); // (step 2.2) get string lines from the file
        lines.forEach(System.out::println);                       // (step 2.2) printout each line
    }

    private  static void createStudentObjects(String[] data, List<Student> students) {


        for (int i = 1; i < data.length; i++) {
            var pieces = data[i].split(";");
            Student student = null;
            switch (pieces[6].toLowerCase()) {
                case "pm":
                    student = new PM(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "dev":
                    student = new Dev(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "uiux":
                    student = new UIUX(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "qa":
                    student = new QA(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
            }

            students.add(student); // (step 2.1) implement method "add()", which add data for Linked List

        }

        System.out.println("STUDENTS: " + students); // (step 2.1) Check LinkedList: printout students' objects
        System.out.println("Number of students: " + students.size()); // (step 2.1) Check LinkedList: printout students' qty









//        System.out.println("**************************************************************************");
//        System.out.println("FYI: the List of pre-defined English levels:");
//        for (com.example.school.additional.EnglishLevel level : EnglishLevel.values()) {
//            System.out.println("* " + level);
//        }

    }
}