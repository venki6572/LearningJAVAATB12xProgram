package ex_25_Collection_Framework.MAP;

import java.util.Hashtable;

public class Lab249_HashTable {

    public  static void main(String[] args){
        Hashtable<String,String> ht = new Hashtable<>();
        ht.put("name","venkatesh");
        ht.put("rollnumber","1DB09EC058");
//        ht.put(null,"ff0");
        System.out.println(ht);
    }
}
