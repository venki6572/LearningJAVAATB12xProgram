package ex_14_Strings;

public class LabStringExamples {

    public static void  main(String[] args){
       String s = "Java";
       char c = s.charAt(2);

       System.out.println(s.charAt(2));
       System.out.println(s.codePointAt(0));

       // Compare to Ignore(String str)

        int result = "abc".compareTo("ABC");
        int result2 = "abc".compareToIgnoreCase("ABC");
        int result3 = "ABC".compareTo("abc");

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        int index = "java".indexOf("a");
        System.out.println(index);

        int index2 = "java".lastIndexOf("a");
        System.out.println(index2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s12 = String.join("z-","Java","tool");
        System.out.println(s12);

        String replace = "Java".replace('a','o');
        System.out.println(replace);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);
    }

}
