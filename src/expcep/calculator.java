package expcep;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("=== Robust Java Calculator ===");

        while (continueCalculating) {
            try {
                // 1. Read first number
                System.out.print("\nEnter first number: ");
                double num1 = scanner.nextDouble();

                // 2. Read operator
                System.out.print("Enter operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);

                // 3. Read second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result;

                // Perform calculation
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            // Explicitly throw arithmetic exception for division by zero
                            throw new ArithmeticException("Division by zero is not allowed!");
                        }
                        result = num1 / num2;
                        break;
                    case '%':
                        if (num2 == 0) {
                            throw new ArithmeticException("Modulo by zero is not allowed!");
                        }
                        result = num1 % num2;
                        break;
                    default:
                        // Custom exception for invalid operation symbols
                        throw new IllegalArgumentException("Invalid operator! Please use +, -, *, /, or %.");
                }

                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Please enter valid numeric values.");
                scanner.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Math Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Input Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                scanner.nextLine(); 
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                continueCalculating = false;
                System.out.println("Thank you for using the calculator!");
            }
        }

        scanner.close();
    }
}

