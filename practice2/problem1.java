class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void nextYear() {
        yearOfStudy++;
    }
}

public class problem1 {
    public static void main(String[] args) {
        Student s = new Student("Bekzhan", 24031914);
        s.nextYear();
        System.out.println(s.getYearOfStudy());
    }
}
