package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WiithoutUsing_Inbuilt {
    public static void main(String[] args) {

        String input = "madams";
        String output= "";

        for (int i = input.length()-1; i>=0; i--)
        {
            output = output+input.charAt(i);
            System.out.print(input.charAt(i));
        }


//        System.out.println(input);
        if(output.equals(input)) {
            System.out.println("Its a palindrome");
        }
        else
            System.out.println("Not a palindrome");
     }
}
