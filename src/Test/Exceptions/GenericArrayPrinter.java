package Test.Exceptions;

public class GenericArrayPrinter {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println(); // Prints a new line after all elements are printed
    }

    public static void main(String[] args) {
        // Example usage with different array types
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Hello", "World", "Generics"};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);

        System.out.print("String Array: ");
        printArray(stringArray);
    }
}