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
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.stream.Stream;
import java.util.logging.Logger; // import java.util.logging (automatically)

public class Main {
    private static final String FILE_NAME = "resources/students.csv";

    private static Logger logger; // (1.1) Implements logging: as variable for have a possibility to write data to it;

    static String[] readFileUsingScanner(String fileName){
        LinkedList<String> data = new LinkedList<>();

        // (1.1.a) Implements marker for the writing data to the var "logger" beginning (logging level = CONFIG);
        logger.log(Level.CONFIG, "Going to read data from: " + fileName);

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

        System.setProperty("java.util.logging.config.file", System.getenv("CONFIG_FILENAME")); // (1.1.d) Pass ->
        // -> the config file name using env var according to the task (configName = CONFIG_FILENAME);
        logger = Logger.getLogger(Main.class.getName()); // (1.1) Initiate var "logger";
        logger.log(Level.CONFIG, "Going to read data from file: " + FILE_NAME); // (1.1.a) Make process beginning ->
        // -> marker, for reading data from the FILE_NAME (CSV-file) with Level = CONFIG;

        List<Student> students = new LinkedList<>();
        String[] data = readFileUsingScanner(FILE_NAME);
        createStudentObjects(data, students);
        Stream<Student> studentStream = students.stream();

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("LINKED LIST");
        System.out.println();

        System.out.println("STUDENTS: " + students);
        System.out.println("TOTAL: " + students.size());

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println("STREAM");
        System.out.println();

        System.out.println("Elements in the Stream :");
        System.out.println();
        Stream<String> lines = Files.lines(Paths.get(FILE_NAME));
        lines.forEach(System.out::println);

        System.out.println();
        System.out.println("****************************************************************************************");

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
                    // (1.1.c) Implements logging for each object type with different log-levels (skipping CONFIG);
                    logger.log(Level.SEVERE, "Create PM student: " + student);
                    break;
                case "dev":
                    student = new Dev(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    // (1.1.c) Implements logging for each object type with different log-levels (skipping CONFIG);
                    logger.log(Level.WARNING, "Create Dev student: " + student);
                    break;
                case "uiux":
                    student = new UIUX(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    // (1.1.c) Implements logging for each object type with different log-levels (skipping CONFIG);
                    logger.log(Level.INFO, "Create UI/UX student: " + student);
                    break;
                case "qa":
                    student = new QA(Integer.parseInt(pieces[0]), pieces[1], pieces[2], pieces[3],
                            Boolean.parseBoolean(pieces[4]), Integer.parseInt(pieces[5]), pieces[6], pieces[7],
                            Boolean.parseBoolean(pieces[8]));
                    // (1.1.c) Implements logging for each object type with different log-levels (skipping CONFIG);
                    logger.log(Level.FINE, "Create QA student: " + student);
                    break;
            }
            students.add(student);
        }
        // (1.1.b) Implements marker for the writing data to the var "logger" ending (logging level = CONFIG);
        logger.log(Level.CONFIG, "Finished reading data from file: " + FILE_NAME + "; Imported " + students.size());
    }
}