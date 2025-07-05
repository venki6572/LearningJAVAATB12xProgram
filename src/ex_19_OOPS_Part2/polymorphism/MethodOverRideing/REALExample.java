package ex_19_OOPS_Part2.polymorphism.MethodOverRideing;

public class REALExample {

    public static void main(String[] args) {
        TC_chrome tcChrome = new TC_chrome();
        tcChrome.openBrowser();

        CommonToAllTC commonToAllTC = new CommonToAllTC();
        commonToAllTC.openBrowser();

        CommonToAllTC cr = new TC_chrome();
            cr.openBrowser();

    }
}
        class CommonToAllTC {
            void openBrowser() {
                System.out.println("Open the Browser");
            }
        }

        class TC_chrome extends CommonToAllTC {
            @Override
            void openBrowser() {
                System.out.println("Starting a chrome");
            }
        }
