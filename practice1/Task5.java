import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        double balance = 0;
        double interestRate = 15; 

        System.out.println("balance" + balance);
        System.out.print("Please enter your money: ");

        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        balance += money;
        System.out.println("You entered " + money + " KZT");
        double interest = balance * interestRate / 100;
        balance += interest;

        System.out.println("Percent added (" + interestRate + "%): " + interest + " KZT");
        System.out.println("New balance: " + balance + " KZT");

        scanner.close();
    }
}
