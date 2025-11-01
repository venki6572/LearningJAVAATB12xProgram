package ex_25_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_Interview {
//    input 1,2,3,4 output 24,18,12,6
    public static void main(String[] args){

        List<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        for(Integer o: al){
            System.out.println(o*6);
        }

    }
}
