package ex_25_Collection_Framework.List;
import java.util.Stack;

public class Lab236_Stack {
    public static void main(String[] args){

        Stack s = new Stack<>();
        s.add("vijay");
        s.add("kiran");
        s.push("bunty");
        s.push("babloo");

        System.out.println(s);
        System.out.println(s.size());

        s.pop();
        System.out.println(s.size());
        System.out.println(s);

    }
}
