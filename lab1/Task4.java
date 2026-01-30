import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		//D = b^2 - 4ac
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int D = b * b - 4 * a * c;
		
		if(D < 0) {
			System.out.println("Error");
		} else System.out.println(D);
		
	}

}
