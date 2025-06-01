package ex_14_Strings;

public class Lab136_String_Creation {

    public static void  main(String[] args){
        String s1 = "Venkatesh";  //String constant Pool
        String s2 = new String("Venkatesh"); // this will be stored in object area
        System.out.println(s1);
        System.out.println(s2);
    }

}
