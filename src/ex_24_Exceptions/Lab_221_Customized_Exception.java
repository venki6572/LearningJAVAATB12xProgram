package ex_24_Exceptions;

public class Lab_221_Customized_Exception {
     public static void main(String[] args){
         Bank sbi = new Bank("INR", 100);
         Bank icici = new Bank("INR", 123);

         Bank canara = new Bank("INR",111);

         Integer totalBalance = sbi.addBank(icici);
         System.out.println(totalBalance);

         Integer totalBalance2 = sbi.addBank(canara);
         System.out.println(totalBalance2);

         Bank JpMorgan = new Bank("USD", 101);
         Integer totalBalance1 = sbi.addBank(JpMorgan);
         System.out.println(totalBalance1);
     }

}
