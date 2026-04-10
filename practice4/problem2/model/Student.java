package problem2.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {

    public Student(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println("eatPizza");
    }

    @Override
    public void retakeExam() {
        System.out.println("retakeExam");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public void move() {
        System.out.println("move");
    }
}
