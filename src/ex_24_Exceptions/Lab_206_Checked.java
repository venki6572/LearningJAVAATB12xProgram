package ex_24_Exceptions;

public class Lab_206_Checked {
    public static void main(String[] args){
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}
