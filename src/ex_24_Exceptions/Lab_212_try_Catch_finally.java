package ex_24_Exceptions;

public class Lab_212_try_Catch_finally {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;

        try {
            c = 10 / a;
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("I will be always executing");
        }
    }
}
