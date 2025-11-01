package ex_25_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterate {

    public static void main(String[] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("id1",1);
        map.put("id2",1);
        map.put("id3",2);
        map.put("id4",3);
        map.put("id5",4);
        map.put("null",100);
        System.out.println(map);

        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + "->"+item.getValue());
        }
    }
}
