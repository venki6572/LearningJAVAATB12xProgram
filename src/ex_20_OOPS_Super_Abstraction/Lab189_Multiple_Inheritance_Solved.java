package ex_20_OOPS_Super_Abstraction;

public class Lab189_Multiple_Inheritance_Solved {

    public static void main(String[] args){
        Child1 child1 = new Child1();
        child1.money();
    }

}

class Child1 implements Father1,Mother1{

    @Override
    public void money() {
        System.out.println("Money from Child");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void f1() {
        System.out.println("f1");
    }

    public void df(){
        System.out.println("DF");
    }
}

interface  Father1{
    void money();
    void f1();

    default void df(){
        System.out.println("This is only allocated");
    }
}

interface  Mother1{
    void money();
    void m1();
}
