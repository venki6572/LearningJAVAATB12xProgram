package ex_25_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_MAP {

    public static void main(String[] args){

        Map hs = new HashMap<>();
        hs.put("name","venkatesh");
        hs.put("rollNumber","1");
        hs.put("phoneNumber","9880642532");
        System.out.println(hs);

        Map hs1 = new LinkedHashMap();
        hs1.put("name","venkatesh");
        hs1.put("rollNumber","1");
        hs1.put("phoneNumber","9880642532");
        System.out.println(hs1);

        Map hs2 = new TreeMap();
        hs2.put("name","venkatesh");
        hs2.put("rollNumber","1");
        hs2.put("phoneNumber","9880642532");
        System.out.println(hs2);
    }
}
