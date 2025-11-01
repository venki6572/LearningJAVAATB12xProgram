package ex_24_Exceptions;

public class Lab_214 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        }
        catch (ArithmeticException |NumberFormatException |ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("i will always be called");
        }
    }
}
