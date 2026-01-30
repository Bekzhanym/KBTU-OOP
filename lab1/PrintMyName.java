import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = reader.nextLine();

		String border = "-";
		border = border.repeat(name.length());

		System.out.println("+" + border + "+");
		System.out.println("|" + name + "|");
		System.out.println("+" + border + "+");
	}

}
