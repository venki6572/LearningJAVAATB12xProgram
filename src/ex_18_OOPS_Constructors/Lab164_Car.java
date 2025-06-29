package ex_18_OOPS_Constructors;

public class Lab164_Car {

    public static void main(String[] args){
        Car Dzire = new Car();
        Dzire.model = "HighEnd";
        Dzire.name = "This is Dzire new";
        System.out.println(Dzire.model);
        System.out.println(Dzire.name);
        System.out.println(Dzire.year);

        //If we wont set the value it will take from default constructors
        Car nano = new Car();
        System.out.println(nano.model);
        System.out.println(nano.name);
        System.out.println(nano.year);

    }
}
