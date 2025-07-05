package ex_19_OOPS_Part2.polymorphism.MethodOverRideing;

public class Venkatesh extends  Father{
    @Override
    void home(){
        System.out.println("venkatesh - 3" +
                "BHK");
    }

    void v1(){
        System.out.println("venkatesh -f1");
    }
}
