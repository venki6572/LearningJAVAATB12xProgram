package ex_16_Arrays;

public class Lab152_Arrays_Print {

    public static void main(String[] args){
        int[] marks = {51,100,35,36,90};
        System.out.println(marks.length);

        System.out.println("----------------");

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Enhanced for loop----------------");

        for(int mark: marks)
        {
            System.out.println(mark);
        }
    }
}
