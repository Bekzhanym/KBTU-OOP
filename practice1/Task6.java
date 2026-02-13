import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your string: ");
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String t = sb.toString();
		
		if(s.equals(t)) {
			System.out.println("Yes! it is palindrome");
		} else System.out.println("No! it is not palindrome");
		
		
	}

	
}
