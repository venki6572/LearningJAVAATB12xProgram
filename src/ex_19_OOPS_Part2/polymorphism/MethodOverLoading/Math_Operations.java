package ex_19_OOPS_Part2.polymorphism.MethodOverLoading;

public class Math_Operations {
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
