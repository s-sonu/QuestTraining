
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation: +, -, *, /, sqrt, or type 'exit' to quit");
            String operation = scanner.next();

            if (operation.equals("exit")) {
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            double result = 0;

            switch (operation) {
                case "+":
                    System.out.println("Enter the second number:");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case "-":
                    System.out.println("Enter the second number:");
                    double num3 = scanner.nextDouble();
                    result = num1 - num3;
                    break;
                case "*":
                    System.out.println("Enter the second number:");
                    double num4 = scanner.nextDouble();
                    result = num1 * num4;
                    break;
                case "/":
                    System.out.println("Enter the second number:");
                    double num5 = scanner.nextDouble();
                    if (num5 != 0) {
                        result = num1 / num5;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                case "sqrt":
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                    } else {
                        System.out.println("Cannot calculate the square root of a negative number.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.println("The result is: " + result);
        }

    }
}

