package practice3;

public class problem1 {

    public static void main(String[] args) {

        System.out.println("1 object");
        Tiger Tiger1 = new Tiger();  

        System.out.println("\n 2nd object");
        Tiger Tiger2 = new Tiger("Bagira", 3, "Orange");  

        System.out.println("\n---- Methods ----");
        Tiger2.makeSound();   
        Tiger2.drinking();        
        Tiger2.drinking("fish");   
        Tiger2.drinking(150);   
    }
}

class Animal {

    protected String name;
    protected int age;

    public Animal() {
        System.out.println("sample animal with anyone");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parametres");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void drinking() {
        System.out.println("Animal is drinking");
    }

    public void drinking(String water) {
        System.out.println("Animal is drinking " + water);
    }
}


class Tiger extends Animal {

    private String color;

    public Tiger() {
        super();
        System.out.println("Tiger constructor sample ");
    }

    public Tiger(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println("Tiger constructor with parameters");
    }

    @Override
    public void makeSound() {
        super.makeSound();  
        System.out.println("Tiger says: RRRRR");
    }

    public void drinking(int amount) {
        System.out.println("Tiger drinkings " + amount + " miligram of water");
    }
}