package ex_20_OOPS_Super_Abstraction;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Lab182 {

    public static  void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

class Vehicle{
    public  int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("Default construtor");
    }

    Vehicle(int a){
        System.out.println("Param con");
    }

    Vehicle(int a, int b){
        System.out.println("Param cons");
    }

    //Method overloading - same, same name function with different arguments
    void message(){
        System.out.println("No Return, No argument");
    }

    void message(int a){
        System.out.println("PC -argument");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends  Vehicle{

    private  int maxSpeed = 281;

    Car(){
        super(100);
    }

    void test(){

    }

    Car(int a){
        System.out.println("PC Car");
    }

    void display(){
        System.out.println("Override of car");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
        super.message();
    }
}
