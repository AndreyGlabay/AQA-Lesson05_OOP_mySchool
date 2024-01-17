import com.example.school.Student;
import com.example.school.section.Dev;
import com.example.school.section.PM;
import com.example.school.section.QA;
import com.example.school.section.UIUX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//NEW BRANCH INIT
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
    }

    public static void main(String[] args) throws IOException {
        // (step 2.1) implements "List" interface (which is subclass for Collections) for ->
        //            -> students' set, with the empty list of the students
        List<Student> students = new LinkedList<>();
        String[] data = readFileUsingScanner(FILE_NAME);    // (step 2.1) read lines from the file
        createStudentObjects(data, students);               // (step 2.1) read objects from the lines
        Stream<Student> studentStream = students.stream();  // (step 2.1) create Stream from the objects

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.1 - LinkedList implementation");
        System.out.println();

        System.out.println("STUDENTS: " + students);        // (step 2.1) Check LinkedList: printout students' objects
        System.out.println("TOTAL: " + students.size());    // (step 2.1) Check LinkedList: printout students' qty

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.2 - Stream for all elements implementation");
        System.out.println();

        System.out.println("Elements in the Stream :");             // (step 2.2) check Stream functionality:
        System.out.println();
        Stream<String> lines = Files.lines(Paths.get(FILE_NAME));   // (step 2.2) get string lines from the file,
        lines.forEach(System.out::println);                         // (step 2.2) printout each line

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.3 - One general Stack implementation");
        System.out.println();

        Stack<Student> studentStack = new Stack<>();        // (step 2.3) modify List to the Stack of all students
        studentStack.addAll(students);                      // (step 2.3) add all elements from the List to the Stack;
        System.out.println("All elements in the 1 Stack :");// (step 2.3) check Stack functionality:
        System.out.println();
        while (!studentStack.isEmpty()) {                   // (step 2.3) until Stack is not empty ->
            System.out.println(studentStack.pop());         // (step 2.3) -> take of an element from the Stack and return it;
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.4 - Multiple-Stacks implementation");
        System.out.println();

        Stack<Student> pmStack = new Stack<>();             // (step 2.4) implement the Stack of PM-students;
        Stack<Student> devStack = new Stack<>();            // (step 2.4) implement the Stack of Dev-students;
        Stack<Student> uiuxStack = new Stack<>();           // (step 2.4) implement the Stack of UIUX-students;
        Stack<Student> qaStack = new Stack<>();             // (step 2.4) implement the Stack of QA-students;

        for (Student student : students) {                  // (step 2.4) take all elements and ->
            if (student instanceof PM) {                    // (step 2.4) -> if an element is instance of PM class ->
                pmStack.push(student);                      // (step 2.4) -> -> add the element to pmStack;
            } else if (student instanceof Dev) {            // (step 2.4) -> if an element is instance of Dev class ->
                devStack.push(student);                     // (step 2.4) -> -> add the element to devStack;
            } else if (student instanceof UIUX) {           // (step 2.4) -> if an element is instance of UIUX class ->
                uiuxStack.push(student);                    // (step 2.4) -> -> add the element to uiuxStack;
            } else if (student instanceof QA) {             // (step 2.4) -> if an element is instance of QA class ->
                qaStack.push(student);                      // (step 2.4) -> -> add the element to qaStack;
            }
        }

        System.out.println("Elements divided to the 4 Stacks:");
        System.out.println();

        System.out.println("PM Stack: " + pmStack);         // (step 2.4) checkout pmStack;
        System.out.println("Dev Stack: " + devStack);       // (step 2.4) checkout devStack;
        System.out.println("UIUX Stack: " + uiuxStack);     // (step 2.4) checkout uiuxStack;
        System.out.println("QA Stack: " + qaStack);         // (step 2.4) checkout qaStack;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 3 - Transform Stack Collections to the Streams for resolve TASK 3.1, 3.2, 3.3");
        System.out.println();

        Stream<Student> pmStream = pmStack.stream();        // (step 3) implement Stream for PM Stack
        Stream<Student> devStream = devStack.stream();      // (step 3) implement Stream for Dev Stack
        Stream<Student> uiuxStream = uiuxStack.stream();    // (step 3) implement Stream for UIUX Stack
        Stream<Student> qaStream = qaStack.stream();        // (step 3) implement Stream for QA Stack

        System.out.println("TASK 3.1 - Streams' Sorting");
        System.out.println();
        System.out.println("PM Students Stream Sorting: ");
        System.out.println();

        pmStream        // (step 3.1) for PM Stream for "studentId" field implement:
                .sorted((s1, s2) -> (int) (s1.getStudentId() - s2.getStudentId()))      // sorting with SortOrder = ASC,
                .skip(7)                                                             // SortSkip = 7 -> skip id [11;17],
                .limit(13)                                                      // SortOut = 13 -> show id [18;30],
                .forEach(System.out::println);                                          // printout the Stream;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 3.2 - Streams' Filtering");
        System.out.println();
        System.out.println("All Students Stream Filtering: ");
        System.out.println();

        studentStream   // (step 3.2) for All Students Stream for "studentId" field implement:
                .filter(student -> student.getStudentId() % 2 != 0)    // filtering aprox a half (odd id only)
                .skip(20)                                           // choose any "start point" (skip first 20 id)
                .limit(24)                                     // FilterOut = 24 -> show 24 id
                .forEach(System.out::println);                         // printout the Stream;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 3.3 - Streams' Mapping");
        System.out.println();
        System.out.println("Map for Dev Students: ");
        System.out.println();

        // (step 3.3) implement mapping for Dev Students, where the key is "studentId" and the value is "studentName";
        Map<Integer, String> devMap = devStream.collect(Collectors.toMap(
                Student::getStudentId,
                Student::getStudentName
        ));
        devMap.forEach((key, value) -> System.out.println("ID = " + key + " -> Name = " + value));

        System.out.println();
        System.out.println("Map for UI/UX Students: ");
        System.out.println();

        // (step 3.3) implement mapping for UIUX Students, where the key is "studentId" and the value is "studentPhone";
        Map<Integer, String> uiuxMap = uiuxStream.collect(Collectors.toMap(
                Student::getStudentId,
                student -> student.getStudentName() + " by phone: " + student.getStudentPhone()
        ));
        uiuxMap.forEach((key, value) -> System.out.println("ID = " + key + " -> Call: " + value));

        System.out.println();
        System.out.println("Map for QA Students: ");
        System.out.println();

        // (step 3.3) implement mapping for QA Students, where the key is "studentId" and the value is "studentMail";
        Map<Integer, String> qaMap = qaStream.collect(Collectors.toMap(
                Student::getStudentId,
                student -> student.getStudentName() + " on address: " + student.getStudentMail()
        ));
        qaMap.forEach((key, value) -> System.out.println("ID = " + key + " -> Mail to: " + value));
    }

    private  static void createStudentObjects(String[] data, List<Student> students) {

        for (int i = 1; i < data.length; i++) {
            var pieces = data[i].split(";");
            Student student = null;
            switch (pieces[6].toLowerCase()) {
                case "pm":
                    student = new PM(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "dev":
                    student = new Dev(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "uiux":
                    student = new UIUX(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
                case "qa":
                    student = new QA(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    break;
            }

            students.add(student); // (step 2.1) implement method "add()", which add data for Linked List
        }
    }
}