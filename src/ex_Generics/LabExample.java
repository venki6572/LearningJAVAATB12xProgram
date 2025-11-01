package ex_Generics;

public class LabExample {
public static void main(String [] args){
    int result = sum(3,5);
    String result1 = sum("venki","yadav");
    System.out.println(result);
    System.out.println(result1);
}

    static int sum(int a, int b){
        return  a+b;
    }

    static String  sum(String a, String b){
        return  a+b;
    }
}
