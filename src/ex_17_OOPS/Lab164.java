package ex_17_OOPS;

public class Lab164 {
    public static void main(String[] args){
        ATB12x amit = new ATB12x();
        amit.paymentID ="01";
        amit.doAssignments();

        ATB12x venki = new ATB12x();
        venki.age =34;
        venki.gender = "male";
        venki.address = "Bangalore velankani tech park";

        venki.eat();
        venki.doAssignments();
        venki.sleep();

    }
}
