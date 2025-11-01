package ex_25_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab233_ArrayList {
    public static void main(String[] args){

        List marks = new ArrayList<>();
        marks.add(93);
        marks.add(99);
        marks.add(92);
        marks.add(66);
        System.out.println(marks);

        System.out.println("_______________________");

        Collections.sort(marks);
        System.out.println(marks);

        System.out.println("_______________________");
        Collections.sort(marks,Collections.reverseOrder());

        System.out.println(marks);
    }
}
