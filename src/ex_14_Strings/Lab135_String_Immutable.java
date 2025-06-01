package ex_14_Strings;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Lab135_String_Immutable {

    public static void  main(String[] args){
        String name = "Venkatesh";  //String constant Pool
        name.toUpperCase();
        System.out.println(name);

        //Mutable here because a new string is going to be created, and hence strings are immutable in JAVA.
        String name1 = name.toUpperCase();
        System.out.println(name1);
    }

}
