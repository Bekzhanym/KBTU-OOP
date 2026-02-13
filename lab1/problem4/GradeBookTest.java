package problem4;

import problem4.Student;
import java.util.*;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Course course = new Course(
                "OOP KBTU",
                "Object-Oriented Programming and Design",
                5,
                "PP1, PP2, ADS"
        );

        List<Student> students = new ArrayList<>();

        System.out.print("How many students? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            Student student = new Student(i + 1, name);

            System.out.print("Enter grade for " + name + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine();

            student.setGrade(grade);

            students.add(student);
        }

        GradeBook gradeBook = new GradeBook(course, students);

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();

        scanner.close();
    }
}
