package ex_19_OOPS_Part2.accessModifier.Police;

public class Cop {

    public int gun;
    String iCard;

    protected Cop(int gun){
        this.gun = gun;
    }

    protected  void canIShoot(){
        System.out.println("Yes i can shoot!");
    }
}
