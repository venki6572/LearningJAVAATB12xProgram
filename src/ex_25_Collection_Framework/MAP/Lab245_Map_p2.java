package ex_25_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab245_Map_p2 {

    public static void main(String[] args){
        Map hs = new HashMap<>();
        hs.put("id","1");
        hs.put("id1","2");
        hs.put("id2","3");
        hs.put("id3","3");
        hs.put("id3","4");
        hs.put("id4",null);
        System.out.println(hs);

        System.out.println(hs.size());
        System.out.println(hs.containsKey("id4"));
        System.out.println(hs.isEmpty());

        System.out.println("**********************");
        System.out.println(hs.keySet().stream().toList());
        System.out.println(hs.entrySet());
    }
}
