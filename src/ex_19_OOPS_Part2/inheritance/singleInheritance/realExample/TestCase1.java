package ex_19_OOPS_Part2.inheritance.singleInheritance.realExample;

public class TestCase1 extends CommonToAllTest {
    void runningTestCase1() {
        System.out.println("Running test case 1");
        startBrowser();
        closeBrowser();
        readExcelFiel();
    }
}
