package Nov.ex_11112024.Revision;

public class TestCase1 extends BaseClass{

    public TestCase1() {
        super();
        System.out.println("DC TC1");
    }

    public void StartTestCase1()
    {
        OpenBrowser("chrome");
        closeBrowser();
    }
    @Override
    public void setBrowser(String browser,boolean isAuth) {

        System.out.println("Child set method1");
        super.setBrowser(browser,isAuth);

    }
    @Override
    public String toString()
    {
        return "test case1{}";
    }



}
