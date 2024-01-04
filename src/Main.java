import com.example.school.Student;
import com.example.school.section.Dev;
import com.example.school.section.PM;
import com.example.school.section.QA;
import com.example.school.section.UIUX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Date; // (step 1) import "LocalDateTime" package for ops with dates;
import java.util.TreeMap; // (step 1.e) import "TreeMap" package for sorting duration in asc-order;

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
        var durationImport = finishImport - startImport;    // (step 1.a) calculate diff. between 2 moments;

        var startCreation = System.currentTimeMillis();     // (step 1.b.1) implement var for start object creation;
        createStudentObjects(data, students);               // THE MOMENT OF OBJECTS CREATION
        Stream<Student> studentStream = students.stream();
        var durationCreating = System.currentTimeMillis() - startCreation; // (step 1.b.1) calculate diff. between 2 moments;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("LinkedList implementation");
        System.out.println();

        var startProcessing = System.currentTimeMillis();   // (step 1.b.2) implement var for start data processing;
        System.out.println("STUDENTS: " + students);        // THE MOMENT OF DATA PROCESSING;
        System.out.println("TOTAL: " + students.size());    // ANOTHER MOMENT OF DATA PROCESSING;
        var durationProcessing = System.currentTimeMillis() - startProcessing; // (step 1.b.2) calculate diff. between 2 moments;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("Stream for all elements implementation");
        System.out.println();

        System.out.println("Elements in the Stream :");
        System.out.println();
        Stream<String> lines = Files.lines(Paths.get(FILE_NAME));
        lines.forEach(System.out::println);

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("One general Stack implementation");
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
        System.out.println("Multiple-Stacks implementation");
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
        System.out.println("Transform Stack Collections to the Streams");
        System.out.println();

        var startStreams = System.currentTimeMillis(); // (step 1.c) implement start time for streams processing;

        Stream<Student> pmStream = pmStack.stream();
        Stream<Student> devStream = devStack.stream();
        Stream<Student> uiuxStream = uiuxStack.stream();
        Stream<Student> qaStream = qaStack.stream();

        System.out.println("Streams' Sorting");
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
        System.out.println("Streams' Filtering");
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
        System.out.println("Streams' Mapping");
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

        // (step 1.e) create TreeMap for sort time duration in ASC-order:
        //              "Long" -> for time duration = key,
        //              "String" -> for msg = value;
        TreeMap<Long, String> durationMap = new TreeMap<>();
        durationMap.put(durationImport, "TASK 1.a - Duration of data import from CSV-file"); // key=duration; value=message;
        durationMap.put(durationCreating, "TASK 1.b - Duration of new objects' creations");  // key=duration; value=message;
        durationMap.put(durationProcessing, "TASK 1.b - Duration of data processing");       // key=duration; value=message;
        durationMap.put(durationStreams, "TASK 1.c - Streams 3 operations' total duration"); // key=duration; value=message;

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 1 - OPERATIONS' DURATIONS");
        System.out.println();
        System.out.println("************* WITHOUT SORTING ************* ");

        // (step 1.d) printout execution speed of import data from csv-file:
        System.out.println("TASK 1.a - Duration of data import from CSV-file = " + durationImport + " ms;");

        // (step 1.d) printout execution speed of objects' creations:
        System.out.println("TASK 1.b - Duration of new objects' creations = " + durationCreating + " ms;");

        // (step 1.d) printout execution speed of data processing:
        System.out.println("TASK 1.b - Duration of data processing = " + durationProcessing + " ms;");

        // (step 1.d) printout execution speed of 3 operations with the streams:
        System.out.println("TASK 1.c - Streams 3 operations' total duration = " + durationStreams + " ms;");

        System.out.println("************* WITH ASC-SORTING ************* ");
        // (step 1.e) implement the loop for "durationMap" entries, which pass all pairs key-value;
        for (Map.Entry<Long, String> entry : durationMap.entrySet()) {
            // for this loop printout to the console according to the pattern: Message + '=' sign + duration + "ms"
            System.out.println(entry.getValue() + " = " + entry.getKey() + " ms;");
        }

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("TASK 2 - OPERATIONS WITH DATES");
        System.out.println();

        // (step 2) implement Date class object = before 1-Dec-2023 = before 123-11-1 = 123-10-30 (30-Nov-2023, 13:12:11):
        var date1 = new Date(123, 10, 30, 13, 12, 11);

        // (step 2) implement Date class object = after 1-Feb-2024 = after 124-1-1 = 123-1-2 (2-Feb-2024, 12:24:55):
        var date2 = new Date(124, 1, 2, 12, 24, 55);

        System.out.println("1st Date: " + date1);      // (step 2.1) printout 1st date;
        System.out.println("2nd Date: " + date2);      // (step 2.1) printout 2nd date;

        System.out.println();
        System.out.println("TASK 2.a - DATES COMPARISON");

        // (step 2.a) confirm that 1st Date is before 1-Dec-2023 (before 123-11-1):
        System.out.println("- Is the 1st Date before 1-Dec-2023 ? :: " + date1.before(new Date(123, 11, 1)));

        // (step 2.a) confirm that 2nd Date is after 1-Feb-2024 (after 124-1-1):
        System.out.println("- Is the 2nd Date after 1-Feb-2024 ? :: " + date2.after(new Date(124, 1, 1)));

        System.out.println();
        System.out.println("TASK 2.a - DIFFERENCE BETWEEN DATES");

        // (step 2.b) compare 1st and 2nd Dates - which date is greater (do this for the next operation).
        var compareDates = date2.compareTo(date1);
        System.out.println("Lets compare two dates first: " +
                "\n - if gets 0 -> date2 equals date1; " +
                "\n - if gets -1 -> date2 before date1; " +
                "\n - if gats 1 -> date2 after date1. ");
        System.out.println("Result of comparation: " + compareDates);
        System.out.println();

        // (step 2.b) calculate difference between two dates in milliseconds.
        float differenceMillis = date2.getTime() - date1.getTime();

        // (step 2.b) printout difference with converting milliseconds to days.
        System.out.println("Difference between 30-Nov-2023 13:12:11 and 2-Feb-2024 12:24:55 = " +
                (differenceMillis) / (24*60*60*1000) + " days");
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