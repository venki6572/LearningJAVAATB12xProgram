package ex_25_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab228_ArrayList {
    public static void main(String[] args){
        List list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("1");
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("5"));
//        System.out.println(list.lastIndexOf());

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        System.out.println("----------------");
        for(Object o:list){
            System.out.println(o);
        }


        System.out.println("----------------");
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
