public class Lab3Problem1 {

    // Interface — разные классы, общее поведение
    interface Greeter {
        String greet();
    }

    static class Student implements Greeter {
        private String name;

        Student(String name) {
            this.name = name;
        }

        @Override
        public String greet() {
            return "Hi, I'm " + name;
        }
    }

    static class Robot implements Greeter {
        @Override
        public String greet() {
            return "Beep. Hello.";
        }
    }

    // Abstract class — одно дерево общие поля, метод + кусок на наследника
    static abstract class Animal {
        protected String name;

        Animal(String name) {
            this.name = name;
        }

        String intro() {
            return "Animal: " + name;
        }

        abstract String sound();
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        @Override
        String sound() {
            return "woof";
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        String sound() {
            return "meow";
        }
    }
}
