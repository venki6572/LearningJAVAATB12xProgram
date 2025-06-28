package ex_14_Strings;

public class Lab141_Interview_P2 {

    public static void  main(String[] args){


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";// here there will be two strings created one with hello and Hello under string pool

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Hello"); // here there will be three times Hello created in object area

        // == --> comparision operator checks the reference of the objec
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        // .equals check the content of the messages
        System.out.println(s2.equalsIgnoreCase(s5));
        System.out.println(s3.equals(s5));
    }

}
