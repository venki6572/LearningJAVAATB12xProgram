package Test.Exceptions;

import java.util.Scanner;

public class AgeException {

    public static void main(String[]args){

        Scanner age = new Scanner (System.in);
        System.out.println("Enter your age");
        int a = age.nextInt();
        System.out.println("Enter you name");
        String b = age.next();

        try{
            if(a <18){
                throw new AgeExcpt();
            }
        }
        catch(AgeExcpt ex){
            System.out.println("You entered an invalid number" + a);
        }
        finally{
            System.out.println("Your age is " + a);
            System.out.println("Your name is " + b);
        }
    }
}
