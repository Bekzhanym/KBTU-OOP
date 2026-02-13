import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        analyzer.run();
    }
}

class Data {

    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0;
        max = Double.NEGATIVE_INFINITY;  //Первое введённое число всегда станет максимумом для этого я использвал
        count = 0;
    }

    public void add(double value){
        sum += value;
        count++;

        if(value > max){
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getMaximum() {
        if (count == 0) {
            return 0;
        }
        return max;
    }
}

class Analyzer {

    public void run(){

        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while(true){
            System.out.print("Enter word 'q' to quit :) ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or q to quit.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        scanner.close();
    }
}
