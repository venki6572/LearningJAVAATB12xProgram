package ex_19_OOPS_Part2.encapsulation;

public class Lab177_encapsulation {

    public static void main(String[]args){
        ICICIBank venki = new ICICIBank("Venki",100);
        System.out.println(venki.getBank_name());
        System.out.println(venki.getBal());
        boolean isCashier = false;
        venki.setBal(10000,true);
        System.out.println(venki.getBal());
    }
}

class ICICIBank{
    private String name;
    private long  bal;
    public String bank_name ="ICICI";

    public ICICIBank(String name,long bal){
     this.name =name;
     this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
            System.out.println("balance is allowed");
        }
        else {
            System.out.println("balance update is not allowed");
        }
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name, boolean isCashier) {
      if(isCashier) {
          this.bank_name = bank_name;
          System.out.println("balance is allowed");
      }
      else {
          System.out.println("balance update is not allowed");
      }
    }
}