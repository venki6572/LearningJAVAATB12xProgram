package ex_20_OOPS_Super_Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args){
        Car1 car = new Car1();
        car.drive();
//        car.testEngine();
    }

}

class Car1 implements Brakes,Engine1 {

    void drive(){
        testEngine();
        startEngine();
        applyBrake();
        stopEngine();
    }

    @Override
    public void testEngine(){
        System.out.println("overridden by car1");
    }
    @Override
    public void applyBrake() {
        System.out.println("Apply the brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Engine");
    }
}


interface  Brakes{
    void applyBrake();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("Concrete complete");
    }
}


