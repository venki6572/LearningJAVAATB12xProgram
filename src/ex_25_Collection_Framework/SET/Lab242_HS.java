package ex_25_Collection_Framework.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab242_HS {
    public static void main(String[] args){
        Set<Integer> set = new HashSet();
        set.add(9);
        set.add(5);
        set.add(1);
        System.out.println("Set elements are: "+set);

//        for(Integer st:set){
//            System.out.println(st);
//        }

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
