package oop;

class Animal {
    String name;
    int age;

    // create a constructor with parameters
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Sound() {
        System.out.println("Unkown sound");

    }
}

class Dog extends Animal {
    String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void Sound() {
        System.out.println("Woof");
    }
}
