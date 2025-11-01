package ex_23_Wrapper_Class;

public class Lab204_Wrapper {

    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // Boxing -int ->Integer - AutoBoxing --> JVM will do it.
        System.out.println(a);
        System.out.println(b.intValue());

        //unboxing
        Integer aa = 43;
        int a1 = aa;  //Unboxing
        System.out.println(a1);   // after unboxing we will loose attributes and behaviours

    }
}
