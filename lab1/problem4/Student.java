package problem4;

public class Student {

    private int id;
    private String name;
    private int grade;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", id: " + id + ", grade: " + grade;
    }
}
