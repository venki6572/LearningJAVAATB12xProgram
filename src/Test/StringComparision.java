package Test;

public class StringComparision {
    public static void main(String[] args){
//        Create a program that demonstrates different ways to compare strings in Java,
//        including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
           String s1 = "Hello";
           String s2 = "hello";
           String s3 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s1==s2);

    }
}
