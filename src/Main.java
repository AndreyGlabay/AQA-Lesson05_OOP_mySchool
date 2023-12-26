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
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    private static final String FILE_NAME = "resources/students.csv";

    static String[] readFileUsingScanner(String fileName){
        LinkedList<String> data = new LinkedList<>(); // change ArrayList to the LinkedList;
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
        // implements "List" interface (which is subclass for Collections) for students' set, with the empty list of the students
        List<Student> students = new LinkedList<>();
        String[] data = readFileUsingScanner(FILE_NAME); // read lines from the file
        createStudentObjects(data, students); // read objects from the lines
        Stream<Student> stream = students.stream(); // create stream from the objects

        Stream<String> lines = Files.lines(Paths.get(FILE_NAME));
        lines.forEach(System.out::println);
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

            students.add(student); // implement method "add()", which add data for Linked List

        }

        System.out.println("STUDENTS: " + students); // printout students' objects
        System.out.println("Number of students: " + students.size()); // printout students' qty

//        System.out.println("**************************************************************************");
//        System.out.println("FYI: the List of pre-defined English levels:");
//        for (com.example.school.additional.EnglishLevel level : EnglishLevel.values()) {
//            System.out.println("* " + level);
//        }

    }
}