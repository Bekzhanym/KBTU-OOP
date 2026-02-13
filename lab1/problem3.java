import java.util.Scanner;

public class problem3 {

    static class Temperature {

        private double temperature;
        private char scale;

        public Temperature() {
            this(0, 'C');
        }

        public Temperature(double value) {
            this(value, 'C');
        }

        public Temperature(char scale) {
            this(0, scale);
        }

        public Temperature(double value, char scale) {
            this.temperature = value;

            if (scale == 'C' || scale == 'F') {
                this.scale = scale;
            } else {
                this.scale = 'C';
            }
        }

        public double Celsius() {
            if (scale == 'C') {
                return temperature;
            } else {
                return 5 * (temperature - 32) / 9;
            }
        }

        public double Farengeit() {
            if (scale == 'F') {
                return temperature;
            } else {
                return (9 * temperature / 5) + 32;
            }
        }

        public void setValue(double value) {
            this.temperature = value;
        }

        public void setScale(char scale) {
            if (scale == 'C' || scale == 'F') {
                this.scale = scale;
            }
        }

        public void setBoth(double value, char scale) {
            this.temperature = value;
            setScale(scale);
        }

        public char getScale() {
            return scale;
        }
    }

   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

        System.out.print("Enter temperature value or Enter word 'q' to quit :) ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("q")) {
            break;
        }

        double value;

        try {
            value = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try again.");
            continue;
        }

        System.out.print("Enter scale (C or F): ");
        char scale = scanner.nextLine().toUpperCase().charAt(0);

        Temperature temp = new Temperature(value, scale);

        System.out.println("In Celsius: " + temp.Celsius());
        System.out.println("In Farengeit: " + temp.Farengeit());
    }

    scanner.close();
}

}
