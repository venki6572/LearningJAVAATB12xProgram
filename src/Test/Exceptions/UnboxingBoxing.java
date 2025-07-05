package Test.Exceptions;

public class UnboxingBoxing {

    int primitiveInt = 10;
    Integer wrapperInt = primitiveInt; // Autoboxing: int is converted to Integer

    Integer wrapperInt1 = new Integer(20);
    int primitiveInt1 = wrapperInt; // Unboxing: Integer is converted to int

}
