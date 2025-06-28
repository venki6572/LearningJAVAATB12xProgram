package ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args){
        int [][] array_2d_old = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };

        int [][] array_2d = new int[3][3];
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;

        array_2d[2][0] = 4;
        array_2d[2][1] = 5;
        array_2d[2][2] = 6;

        System.out.println(array_2d);
    }
}
