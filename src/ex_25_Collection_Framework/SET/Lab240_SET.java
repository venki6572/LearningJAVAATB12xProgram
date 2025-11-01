package ex_25_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {

    public static void main(String[] args){

        Set hs = new HashSet<>();
        Set lhs = new LinkedHashSet();
        Set ths = new TreeSet();

        hs.add("venki");
        hs.add("Venki");
        hs.add("Venki");
        hs.add("Suji");
        System.out.println(hs);

    }
}
