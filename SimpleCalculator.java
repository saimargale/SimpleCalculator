import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b = 0, c = 0;
        char operator;

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, s for square root): ");
        operator = sc.next().charAt(0);

        // If the operator is not 's' (for square root), ask for a second number
        if (operator != 's') {
            System.out.print("Enter second number: ");
            b = sc.nextDouble();
        }

        // Perform the operation based on the operator entered
        switch (operator) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                if (b != 0) {
                    c = a / b;
                } else {
                    System.out.println("Error! Cannot divide by zero.");
                    return;
                }
                break;
            case 's':  // Square root operation
                if (a >= 0) {
                    c = Math.sqrt(a);
                } else {
                    System.out.println("Error! Cannot take square root of a negative number.");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid operator.");
                return;
        }

        System.out.println("Result: " + c);
    }
}