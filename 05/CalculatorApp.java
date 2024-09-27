import java.util.Scanner;

class Calculator {
    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '/':
                try {
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
