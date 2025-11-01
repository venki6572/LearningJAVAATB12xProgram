package ex_25_Collection_Framework.MAP;

import java.util.*;

public class Lab248_Mapwith_ArrayList {

    public static void main(String[] args){


        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","venkatesh");
        student1.put("rollnumber","0553");
        student1.put("address","BLR");
        student1.put("home_address","KSTOWN");
        System.out.println(student1);

        Map<String,Object> student2 = new LinkedHashMap<>();
        student2.put("name","Sujatha");
        student2.put("rollnumber","2823");
        student2.put("address","BLR");
        student2.put("home_address","VIJAYANAGAR");
        System.out.println(student2);

        Map<String,Object> student33 = new TreeMap<>();
        student33.put("name","Sujatha");
        student33.put("rollnumber","2823");
        student33.put("address","BLR");
        student33.put("home_address","VIJAYANAGAR");
        System.out.println(student33);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println(students);
    }
}
