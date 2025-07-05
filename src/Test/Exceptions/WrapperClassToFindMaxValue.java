package Test.Exceptions;

public class WrapperClassToFindMaxValue {

        public static void main(String[] args) {
            // Maximum value for an int
            int maxIntValue = Integer.MAX_VALUE;
            System.out.println("Maximum value of int: " + maxIntValue);

            // Maximum value for a long
            long maxLongValue = Long.MAX_VALUE;
            System.out.println("Maximum value of long: " + maxLongValue);

            // Maximum value for a double
            double maxDoubleValue = Double.MAX_VALUE;
            System.out.println("Maximum value of double: " + maxDoubleValue);

            // Maximum value for a character
            char maxCharValue = Character.MAX_VALUE;
            System.out.println("Maximum value of char: " + (int) maxCharValue); // Cast to int to see numeric value
        }
}

