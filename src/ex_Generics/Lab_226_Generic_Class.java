package ex_Generics;

public class Lab_226_Generic_Class {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass(10);
        GenericClass g2 = new GenericClass("pramode");
        GenericClass g3 = new GenericClass(3.24);
        g3.getData();
    }
}
class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}
