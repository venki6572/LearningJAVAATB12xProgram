package ex_24_Exceptions;

public class Lab_222_ThrowExample {
    public static void main(String[] args){
//        validate_age_for_club(17);
        validate_age_for_club(27);
    }

    static void validate_age_for_club(int age){
        if (age<18)
        {
            try
            {
               throw new Exception("Age cant be 18");
            }
           catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        else{
            System.out.println("Enjoy clubbing");
        }

    }
}
