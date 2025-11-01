package ex_25_Collection_Framework.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args){
        List fruits = List.of("Banana","Pomogranate","Gauva","Watermelon");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("venkatesh");
        arrayList.add("yadav");
        arrayList.add("venkatesh");
        arrayList.add("test");
        arrayList.add(123);
        arrayList.add(null);
        arrayList.add(25);
        arrayList.add(null);

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        arrayList.remove(1);
        arrayList.add("test");

        System.out.println(arrayList);
        System.out.println(arrayList.get(7));
        System.out.println(new HashSet<>(arrayList));
    }
}
