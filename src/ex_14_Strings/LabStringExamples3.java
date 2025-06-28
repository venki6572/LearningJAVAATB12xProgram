package ex_14_Strings;

public class LabStringExamples3 {
    public static void main(String[] args){

        String s = "Java".substring(1);
        System.out.println(s);

        String s1 = "Java".substring(0,2);
        System.out.println(s1);

        char[] arr= "Java".toCharArray();
        System.out.println(arr);

        String st = "JAVA  ".trim();
        System.out.println(st);

        boolean b = " ".isBlank();
        System.out.println(b);

        String s2 = "ab".repeat(3);
        System.out.println(s2);

        boolean b1 = "Java".equalsIgnoreCase("java");
        System.out.println(b1);

        String s11 = String.format("%s = %d", "age", 25);
        System.out.println(s11);

        long count = "a\n\nbc".lines().count();
        System.out.println(count);


    }
}
