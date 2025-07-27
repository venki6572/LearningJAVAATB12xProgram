package ex_20_OOPS_Super_Abstraction;

public class Lab188_Interface_P2 {
    public static void main(String[] args){
        Loan loan = new Loan();
        loan.test();
    }
}

class Loan implements  I1,I2{

    void test(){
        icm1();
        icm2();
        icm3();
    }
    @Override
    public void icm1() {
        System.out.println("father loan");
    }

    @Override
    public void icm2() {
        System.out.println("Grand father loan");
    }

    @Override
    public void icm3() {
        System.out.println("Grand grand father loan");
    }
}

interface I1{
    void icm1();
    void icm2();
}

interface I2{
    void icm3();
}