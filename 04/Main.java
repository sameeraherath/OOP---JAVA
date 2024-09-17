import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {

            // Get user input
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            // Division

            System.out.println("Enter a number to divide by: ");
            int div = sc.nextInt();
            int result = num / div;

            System.out.println("Result: " + result);
        } catch ( ArithmeticException e) {

            // Handle divide by zero exception
            System.out.println("Error: " + e.getMessage());

        } catch ( Exception e) {

            // Handle any other exceptions (like invalid input)
            System.out.println("Error: Please enter a valid number.");
        } finally {

            System.out.println("Done.");
        }

        sc.close();
    }
}