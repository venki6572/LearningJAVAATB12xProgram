package ex_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_Real_Example_Automation {
   public static void main(String[] args){
       List<Object> lisElement = new ArrayList<>();
       lisElement.add("email");
       lisElement.add(12345);
       lisElement.add(true);

       System.out.println(lisElement);
   }

}
