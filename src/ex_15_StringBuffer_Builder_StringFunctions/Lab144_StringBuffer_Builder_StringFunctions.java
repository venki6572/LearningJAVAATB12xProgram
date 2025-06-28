package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuffer_Builder_StringFunctions {

    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer("Venkatesh");
        StringBuilder stringBuilder = new StringBuilder("yadav");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.append("paramesh"));
    }
}
