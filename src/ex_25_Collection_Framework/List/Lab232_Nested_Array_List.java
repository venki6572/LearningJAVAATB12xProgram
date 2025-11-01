package ex_25_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_Array_List {

    public static void main(String[] args){

        List<String> fruit1 = new ArrayList<>();
        fruit1.add("Orange");
        fruit1.add("Mango");
        fruit1.add("Banana");
        System.out.println(fruit1);

        List<String> fruit2 = new ArrayList<>();
        fruit2.add("watermelon");
        fruit2.add("papaya");
        fruit2.add("pineapple");
        System.out.println(fruit2);

        List<String> vegetables = new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("carrot");
        System.out.println(vegetables);

        List vegetables_fruits = new ArrayList<>();
        vegetables_fruits.add(fruit1);
        vegetables_fruits.add(fruit2);
        vegetables_fruits.add(vegetables);


        System.out.println(vegetables_fruits);

        Object o = vegetables_fruits.get(2);
        System.out.println(o);

        System.out.println(vegetables_fruits.size());
    }
}
