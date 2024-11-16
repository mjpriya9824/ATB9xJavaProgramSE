package Nov.ex_07112024.REALEXAMPLE1;

public class TC2 extends Common_base_test{
    public TC2() {
        System.out.println("DC-CHILD");
    }
    void testcase2(){
        startBrowser();
        readFile();
        CloseBrowser();
    }

}
