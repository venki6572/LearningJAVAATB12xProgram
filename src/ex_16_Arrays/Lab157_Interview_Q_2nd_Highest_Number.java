package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_Highest_Number {

    public static void main(String[] args){
        int[] numbers = {34,12,24,28,100,6};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

        int highest = 0;
        int secondHighest = 0;

        for(int num :numbers){

            if (num > highest){
                highest = num;
                secondHighest = highest;

            }
            else if (num > secondHighest &&  num != highest) {
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }
}
