package Test.Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            // Attempt an operation that might cause an ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);

            // Attempt an operation that might cause an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Error: Attempted to access an array element with an invalid index.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            System.out.println("Error: An arithmetic operation, likely division by zero, occurred.");
        } catch (Exception e) { // Catch-all for any other unexpected exceptions
            System.out.println("Caught a general Exception: " + e.getMessage());
            System.out.println("An unexpected error occurred.");
        } finally {
            System.out.println("This block always executes, regardless of whether an exception occurred.");
        }
        System.out.println("Program continues after the try-catch-finally block.");
    }
}
