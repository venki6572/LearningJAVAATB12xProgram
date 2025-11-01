package ex_25_Object;

public class Sample extends  Object{
    @Override
    public String toString() {
        System.out.println("This is coming from object class");
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode(){
        System.out.println("coming from object");
        return 0;
    }
}
