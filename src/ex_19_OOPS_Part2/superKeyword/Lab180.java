package ex_19_OOPS_Part2.superKeyword;

public class Lab180 {

}

class  BaseClass {
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Change browser is not allowed, Not a admin");
        }
    }

    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Opening Browser!! -->" + browserName);
    }

    void closeBrowser() {
        System.out.println("closing Browser!!");
    }


    class TestCase1 extends BaseClass {

        public void tc(){}
        public TestCase1(String browser) {
            super(browser);
            super.getBrowser();
            super.closeBrowser();

            this.tc();

        }
    }
}