package ex_16_Arrays;

import java.util.Arrays;

public class Lab149_Arrays {

    public static void main(String []args){

        int a = 10;
        int[] marks = {91,90,91,52,54,65,68,70};
        boolean [] is_married_couple = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

//        array index out of bound exception
//        System.out.println(marks[-1]);

        char c ='A';
       String  name = "Venkatesh";
       String [] name_each_element_char =name.split("");
       System.out.println(Arrays.toString(name_each_element_char));



    }
}
