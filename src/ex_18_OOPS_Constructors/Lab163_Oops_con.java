package ex_18_OOPS_Constructors;

public class Lab163_Oops_con {
    public static void main(String[] args) {
        A a1 = new A();
        new A();
//        System.out.println(a1);
    }
}
    class A {
        A(){
            System.out.println("I want to read csv file");
            System.out.println("Open the page before loading the scripts");
            System.out.println("this is from constructors");
            System.out.println("You can do what ever you want when you create a construtor");
        }
}

