package Test.Exceptions;

public class tryCatchBlcok {

    public static void main (String[] args)
    {

        int[] arr = new int[4];
        try
        {
            int i = arr[4];
            System.out.println("Inside try block");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in Catch block");
        }

        System.out.println("Outside try-catch clause");
    }
}
