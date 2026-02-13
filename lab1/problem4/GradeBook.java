package problem4;

import java.util.List;

public class GradeBook {

    private Course course;
    private List<Student> students;

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public double determineClassAverage() {
        int total = 0;

        for (Student s : students) {
            total += s.getGrade();
        }

        return (double) total / students.size();
    }

    public Student getMinimum() {
        Student min = students.get(0);

        for (Student s : students) {
            if (s.getGrade() < min.getGrade()) {
                min = s;
            }
        }

        return min;
    }

    public Student getMaximum() {
        Student max = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > max.getGrade()) {
                max = s;
            }
        }

        return max;
    }

    public void outputBarChart() {
        int[] freq = new int[11];
        for (Student s : students) {
            freq[s.getGrade() / 10]++;
        }
        System.out.println("\nGrades distribution:");
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.print((i * 10) + "-" + (i * 10 + 9) + ": ");
            }
            for (int j = 0; j < freq[i]; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        Student min = getMinimum();
        Student max = getMaximum();
        System.out.println("Class average is " + String.format("%.2f", avg) + ".");
        System.out.println("Lowest grade is " + min.getGrade() + " (" + min.getName() + ", id: " + min.getId() + ").");
        System.out.println("Highest grade is " + max.getGrade() + " (" + max.getName() + ", id: " + max.getId() + ").");
        outputBarChart();
    }

    @Override
    public String toString() {
        return course.toString() + "\nStudents count: " + students.size();
    }
}
