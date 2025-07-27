package ex_20_OOPS_Super_Abstraction;

public class Lab185_Abstract {
    public static  void main(String[] args){
     Son s1 = new Son();
     s1.loan50k();
    }
}


class Normal {
}

abstract class Father{
    abstract void loan50k();
}

class Son extends Father{
    @Override
    void loan50k(){
        System.out.println("Loan given!!");
    }
}