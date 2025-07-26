package ex_19_OOPS_Part2.superKeyword;

public class Lab181 {
    public  static void main(String[] args){
        Son s = new Son();

        System.out.println( s.gold);
        s.newHome();
    }
}

class Father{
    Father(){
        System.out.println("DC Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home Father");
    }
}

class Son extends  Father{
    Son(){
        super();
        System.out.println("AC SON");
    }

    void newHome(){
        super.home();
        System.out.println(super.gold);
    }
}
