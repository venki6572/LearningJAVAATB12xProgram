package ex_18_OOPS_Constructors;

public class Lab165_Const {

    public static void main(String[] args){

        Car2 tesla = new Car2();
        System.out.println(tesla.model);
        System.out.println(tesla.year);


        System.out.println("***************parameterized constructor************");
        Car2 tesla1 =new Car2("suzuki",2020);
        System.out.println(tesla1.model);
        System.out.println(tesla1.year);

        System.out.println("***************parameterized constructor overloading************");
        Car2 tesla2 =new Car2("maruthi is only overloaded");
        System.out.println(tesla2.model);
        System.out.println(tesla2.year);
    }
}
