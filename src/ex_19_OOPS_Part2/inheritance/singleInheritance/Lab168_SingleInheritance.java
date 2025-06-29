package ex_19_OOPS_Part2.inheritance.singleInheritance;

public class Lab168_SingleInheritance {

    public  static void main(String[] args){
        Son venkatesh = new Son();
        venkatesh.bhk2();
        int gold= venkatesh.gold;
        System.out.println(gold);
        venkatesh.bhk3();

        //Cousin cant extend father properties
        Cousin c = new Cousin();
        c.bhk3();

        //System.out.println(c.gold); this is not possible because

    }
}
