package ex_25_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_HS_LHS_TS {

    public static void main(String[] args){

        Set<String> hs = new HashSet<>(); // null is availabe, no duplicates, un ordered,
        hs.add("apple");
        hs.add("orange");
        hs.add("Butterfruit");
        hs.add(null);
        hs.add("orange");
        System.out.println(hs);

        Set<String> lhs = new LinkedHashSet(); // null is availabe, no duplicates, natural order,
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("Butterfruit");
        lhs.add(null);
        lhs.add("kiwi");
        System.out.println(lhs);

        Set<String> ths = new TreeSet(); // null is not available, no duplicates, ordered set,
        ths.add("apple");
        ths.add("orange");
        ths.add("Butterfruit");
        ths.add("kiwi");
        ths.add("apple");
        System.out.println(ths);

    }
}
