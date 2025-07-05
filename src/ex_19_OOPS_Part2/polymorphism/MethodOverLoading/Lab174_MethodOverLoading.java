package ex_19_OOPS_Part2.polymorphism.MethodOverLoading;

public class Lab174_MethodOverLoading {
    public static void main(String[] args){
        Math_Operations m1 = new Math_Operations();
        int r=m1.add(2,5);
        System.out.println(r);
        int r1=m1.add(5,6,8);
        System.out.println(r1);
        double r2=m1.add(3.45,4.45);
        System.out.println(r2);
    }
}

//the above is an example for compile time polymorphism, call to the method is given during compile
// time and untill we pass the parameter, we are not aware to which method the call is made
