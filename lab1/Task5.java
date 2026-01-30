import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		int balance = 0;
		System.out.println("Your current balance is: " + balance);
		System.out.println("Please enter your money: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		balance += money;
		
		System.out.println("You added " + money + "KZT! Your current balance is " + balance);
		
	}

}
