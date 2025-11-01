package ex_Generics;

public class Lab_224 {
    public static void main(String [] args){
       sum(3,5);
       sum("venki","yadav");
       sum(2.5,3.4);

    }

//    static Integer sum(int a, int b){
//        return  a+b;
//    }
//
//    static String  sum(String a, String b){
//        return  a+b;
//    }
//
//    static Double  sum(Double a, Double b){
//        return  a+b;
//    }

    static<T> T sum(T a, T b) {
        System.out.println(a+""+b);
        System.out.println("a"+"b");
        return null;
    }

}
