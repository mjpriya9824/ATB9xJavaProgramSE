package Nov.ex_07112024.REALEXAMPLE1;

public class TC1 extends Common_base_test{
    public TC1() {
        System.out.println("DC-CHILD");
    }
    void testcase1(){
        startBrowser();
        readFile();
        CloseBrowser();
    }


}
