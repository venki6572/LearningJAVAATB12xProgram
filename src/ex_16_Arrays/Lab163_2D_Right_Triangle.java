package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ther numbere:");

        int n  = scanner.nextInt();

        for (int i=0;i <= n; i++){
            for (int j=0;j < i; j++){
                System.out.print("*");
                System.out.print('\t');
            }
            System.out.println();
        }

        for (int i=n;i >= 1; i--){
            for (int j=1;j <= i; j++){
                System.out.print("*");
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
