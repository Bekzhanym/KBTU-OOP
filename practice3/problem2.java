package practice3;

import java.util.*;


public class problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Person> people = new HashSet<>();

        while (true) {
            System.out.println("\n1 - Add a Person");
            System.out.println("2 - Print All");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("1 - Person");
                System.out.println("2 - Student");
                System.out.println("3 - Staff");
                System.out.print("Choose type: ");

                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                if (type == 1) {
                    people.add(new Person(name, address));
                }

                else if (type == 2) {
                    System.out.print("Program: ");
                    String program = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    System.out.print("Fee: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();

                    people.add(new Student(name, address, program, year, fee));
                }

                else if (type == 3) {
                    System.out.print("School: ");
                    String school = sc.nextLine();

                    System.out.print("Pay: ");
                    double pay = sc.nextDouble();
                    sc.nextLine();

                    people.add(new Staff(name, address, school, pay));
                }
            }

            else if (choice == 2) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }

            else if (choice == 0) {
                break;
            }
        }

        sc.close();
    }
}


class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}


class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address,
                   String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString()
                + ", program=" + program
                + ", year=" + year
                + ", fee=" + fee + "]";
    }
}


class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address,
                 String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ", school=" + school
                + ", pay=" + pay + "]";
    }
}

