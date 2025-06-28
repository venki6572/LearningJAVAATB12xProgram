package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args){

        int[] array ={25,35,45,99,109,181,19,34,22};
        int max_number = give_max_element_array(array);
        int min_number = give_min_element_array(array);
        System.out.println("max is "+max_number);
        System.out.println("min is "+min_number);
    }

    static int give_max_element_array(int[] array){
         int max = array[0];

         //logic
        for (int i=0;i<array.length;i++){
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        return max;
    }

    static int give_min_element_array(int[] array){
        int min = array[0];

        //logic
        for (int i=0;i<array.length;i++){
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        return min;
    }
}

