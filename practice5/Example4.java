import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        StringTokenizer expressions = new StringTokenizer(line);

        while (expressions.hasMoreTokens()) {
            String expr = expressions.nextToken().trim();
            if (!expr.isEmpty()) {
                evaluate(expr);
            }
        }
    }

    private static void evaluate(String expr) {
        StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);

        try {
            if (!tokenizer.hasMoreTokens()) {
                System.out.println("Invalid syntax");
                return;
            }
            String leftString = tokenizer.nextToken().trim();
            if (!tokenizer.hasMoreTokens()) {
                System.out.println("Invalid syntax");
                return;
            }
            String operator = tokenizer.nextToken();
            if (!tokenizer.hasMoreTokens()) {
                System.out.println("Invalid syntax");
                return;
            }
            String rightString = tokenizer.nextToken().trim();

            double leftOperand;
            double rightOperand;

            try {
                leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
                System.out.println("Left operand is not a number: \"" + leftString + "\"");
                return;
            }

            try {
                rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
                System.out.println("Right operand is not a number: \"" + rightString + "\"");
                return;
            }

            double result;
            if ("+".equals(operator)) {
                result = leftOperand + rightOperand;
            } else if ("-".equals(operator)) {
                result = leftOperand - rightOperand;
            } else if ("*".equals(operator)) {
                result = leftOperand * rightOperand;
            } else if ("/".equals(operator)) {
                result = leftOperand / rightOperand;
            } else {
                System.out.println("Invalid syntax");
                return;
            }

            System.out.println("Result: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
        }
    }
}
