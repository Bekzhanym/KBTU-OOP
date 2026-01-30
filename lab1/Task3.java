import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your mark?");
		double num = scanner.nextInt();
		
		if(num >= 49.5 && num < 54.5) {
			System.out.println("D");
		} else if(num >= 54.5 && num < 59.5) {
			System.out.println("D+");
		} else if(num >= 59.5 && num < 64.5) {
			System.out.println("C-");
		} else if(num >= 64.5 && num < 69.5) {
			System.out.println("C");
		} else if(num >= 69.5 && num < 74.5) {
			System.out.println("C+");
		} else if(num >= 74.5 && num < 79.5) {
			System.out.println("B-");
		} else if(num >= 79.5 && num < 84.5) {
			System.out.println("B");
		} else if(num >= 84.5 && num < 89.5) {
			System.out.println("B+");
		} else if(num >= 89.5 && num < 94.5) {
			System.out.println("A-");
		} else {
			System.out.println("A");
		}

	}

}
