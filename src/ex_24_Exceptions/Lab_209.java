package ex_24_Exceptions;

public class Lab_209 {
    public static void main(String[] args){
        int a = 0;
        int b = 0;


        // one try block can have multiple catch block
        
        try {
            b = 10/a;
        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//
//        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

    }
}
