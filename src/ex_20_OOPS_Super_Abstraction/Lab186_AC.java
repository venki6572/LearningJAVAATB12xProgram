package ex_20_OOPS_Super_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
        WagonR wr = new WagonR();
        wr.drive();
    }
}
    class WagonR extends  Engine implements Tyre, ChangeGear {

        void drive() {
            rubberTyre();
            blackColorDot();
            StartEngine();
            gearType();
            StopEngine();
        }

        @Override
        void StartEngine() {
            System.out.println("Starts the wagonR");
        }

        @Override
        public void rubberTyre() {
            System.out.println("Rubber Type is black");
        }

        @Override
        public void blackColorDot() {
            System.out.println("There is a black color dot");
        }

        @Override
        public void gearType() {
            System.out.println("Gear Type is manual");
        }
    }

    abstract class Engine {
        abstract void StartEngine();

        void StopEngine(){
            System.out.println("Stop");
        }
    }

    interface  Tyre {
    void rubberTyre();
    void blackColorDot();

        //JDK 11 hasve this feature
        default void m2() {

        }

        static void m1() {

        }
    }

interface  ChangeGear {
    void gearType();

}






