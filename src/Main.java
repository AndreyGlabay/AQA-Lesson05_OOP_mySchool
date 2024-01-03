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

public class Main {
    private static final String FILE_NAME = "resources/students.csv";

    static String[] readFileUsingScanner(String fileName){
        LinkedList<String> data = new LinkedList<>();
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
        List<Student> students = new LinkedList<>();

        var startImport = System.currentTimeMillis();       // (step 1.a) implement var for start data import from CSV-file;
        String[] data = readFileUsingScanner(FILE_NAME);    // THE MOMENT OF DATA IMPORT
        var finishImport = System.currentTimeMillis();      // (step 1.a) implement var for start data import from CSV-file;
        var durationImport = finishImport - startImport;    // (step 1.a) implement var for shows diff. between 2 moments;
        System.out.println();
        System.out.println("Duration of data import from CSV-file = " + durationImport + " ms;"); // (1.a) printout the diff;

        var startProcessing = System.currentTimeMillis();   // (step 1.b) implement var for start data processing;
        createStudentObjects(data, students);               // THE MOMENT OF OBJECTS CREATION
        Stream<Student> studentStream = students.stream();
        var durationProcessing = System.currentTimeMillis() - startProcessing; // (step 1.b) implement var for shows diff. between 2 moments;
        System.out.println("Duration of data processing = " + durationProcessing + " ms;"); // (1.b) printout the diff;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.1 - LinkedList implementation");
        System.out.println();

        System.out.println("STUDENTS: " + students);
        System.out.println("TOTAL: " + students.size());

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.2 - Stream for all elements implementation");
        System.out.println();

        System.out.println("Elements in the Stream :");
        System.out.println();
        Stream<String> lines = Files.lines(Paths.get(FILE_NAME));
        lines.forEach(System.out::println);

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.3 - One general Stack implementation");
        System.out.println();

        Stack<Student> studentStack = new Stack<>();
        studentStack.addAll(students);
        System.out.println("All elements in the 1 Stack :");
        System.out.println();
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2.4 - Multiple-Stacks implementation");
        System.out.println();

        Stack<Student> pmStack = new Stack<>();
        Stack<Student> devStack = new Stack<>();
        Stack<Student> uiuxStack = new Stack<>();
        Stack<Student> qaStack = new Stack<>();

        for (Student student : students) {
            if (student instanceof PM) {
                pmStack.push(student);
            } else if (student instanceof Dev) {
                devStack.push(student);
            } else if (student instanceof UIUX) {
                uiuxStack.push(student);
            } else if (student instanceof QA) {
                qaStack.push(student);
            }
        }

        System.out.println("Elements divided to the 4 Stacks:");
        System.out.println();

        System.out.println("PM Stack: " + pmStack);
        System.out.println("Dev Stack: " + devStack);
        System.out.println("UIUX Stack: " + uiuxStack);
        System.out.println("QA Stack: " + qaStack);

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 3 - Transform Stack Collections to the Streams for resolve TASK 3.1, 3.2, 3.3");
        System.out.println();

        var startStreams = System.currentTimeMillis(); // (step 1.c) implement start time for streams processing;

        Stream<Student> pmStream = pmStack.stream();
        Stream<Student> devStream = devStack.stream();
        Stream<Student> uiuxStream = uiuxStack.stream();
        Stream<Student> qaStream = qaStack.stream();

        System.out.println("TASK 3.1 - Streams' Sorting");
        System.out.println();
        System.out.println("PM Students Stream Sorting: ");
        System.out.println();

        pmStream
                .sorted((s1, s2) -> (int) (s1.getStudentId() - s2.getStudentId()))
                .skip(7)
                .limit(13)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 3.2 - Streams' Filtering");
        System.out.println();
        System.out.println("All Students Stream Filtering: ");
        System.out.println();

        studentStream
                .filter(student -> student.getStudentId() % 2 != 0)
                .skip(20)
                .limit(24)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 3.3 - Streams' Mapping");
        System.out.println();
        System.out.println("Map for Dev Students: ");
        System.out.println();

        Map<Integer, String> devMap = devStream.collect(Collectors.toMap(
                Student::getStudentId,
                Student::getStudentName
        ));
        devMap.forEach((key, value) -> System.out.println("ID = " + key + " -> Name = " + value));

        System.out.println();
        System.out.println("Map for UI/UX Students: ");
        System.out.println();

        Map<Integer, String> uiuxMap = uiuxStream.collect(Collectors.toMap(
                Student::getStudentId,
                student -> student.getStudentName() + " by phone: " + student.getStudentPhone()
        ));
        uiuxMap.forEach((key, value) -> System.out.println("ID = " + key + " -> Call: " + value));

        System.out.println();
        System.out.println("Map for QA Students: ");
        System.out.println();

        Map<Integer, String> qaMap = qaStream.collect(Collectors.toMap(
                Student::getStudentId,
                student -> student.getStudentName() + " on address: " + student.getStudentMail()
        ));
        qaMap.forEach((key, value) -> System.out.println("ID = " + key + " -> Mail to: " + value));

        var durationStreams = System.currentTimeMillis() - startStreams; // (step 1.c) implement duration of streams processing;
        System.out.println("Streams duration = " + durationStreams + " ms;"); // (step 1.c) printout streams duration;
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
            students.add(student);
        }
    }
}