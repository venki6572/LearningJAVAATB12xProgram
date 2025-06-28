package ex_14_Strings;

public class Lab140_Interview_P1 {

    public static void  main(String[] args){


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";// here there will be two strings created one with hello and Hello under string pool

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hello"); // here there will be three times Hello created in object area
        System.out.println();

    }

}
