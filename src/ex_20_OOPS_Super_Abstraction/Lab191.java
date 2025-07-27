package ex_20_OOPS_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args){
        Pramode p = new Datta();
        p.display();
        Datta d1 = new Datta();
        System.out.println(p.a);
    }
}

class Datta implements  Pramode{

    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Pramode {
    int a =10;

    void display();
}
