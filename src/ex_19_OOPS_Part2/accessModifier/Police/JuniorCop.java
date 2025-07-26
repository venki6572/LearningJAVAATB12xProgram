package ex_19_OOPS_Part2.accessModifier.Police;

public class JuniorCop {
   public static void main(String[]args){
       Cop juniorCop = new Cop(10);
       juniorCop.canIShoot();
       System.out.println(juniorCop.gun);
   }

}
