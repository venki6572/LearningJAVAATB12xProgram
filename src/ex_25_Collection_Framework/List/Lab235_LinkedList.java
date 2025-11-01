package ex_25_Collection_Framework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab235_LinkedList {

    public static void main(String[] args){

        List<String> mylist = new LinkedList();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        System.out.println(mylist);
        System.out.println("___________________--");

        for(String str: mylist){
            System.out.println(str);
        }

        System.out.println("&&&&&&&&&&&");
        Iterator<String> iterator = mylist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
