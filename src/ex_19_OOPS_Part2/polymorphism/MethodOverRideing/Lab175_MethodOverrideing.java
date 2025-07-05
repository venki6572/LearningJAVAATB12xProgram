package ex_19_OOPS_Part2.polymorphism.MethodOverRideing;

public class Lab175_MethodOverrideing {

    public static void main(String[] args){
        Venkatesh venkatesh = new Venkatesh();
        venkatesh.v1();
        venkatesh.home();

        Father f = new Father();
        f.f1();
        f.home();

        //overriden function
        Father f1 = new Venkatesh();
        f1.home();

        //call to the function is made during runtime ,
        //inheritance is required for method overrideing,
        //method name in subclass should be same as in super class.
    }
}
