package ex_24_Exceptions;

public class Lab_208 {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int c;

        // one try block can have multiple catch block

        try {
            c = b/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
