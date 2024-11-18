package Nov.ex_11112024.Revision;

public class BaseClass {
    //common class
    private String browser;

    public BaseClass() {
        System.out.println("DC BASE CLASS");
    }


    public BaseClass(String browser) {
        this.browser=browser;
        System.out.println("CC- BASE CLASS");

    }
        public String getBrowser() {
        return browser;
    }


    public void setBrowser(String browser,boolean isAuth) {

        if (isAuth) {
            this.browser = browser;
        }
        else
        {
            System.out.println("not allowed");
        }
    }

       public   void OpenBrowser() {
            System.out.println("open browser 1");
        }
        //overloadin
        public void OpenBrowser(String browser)
        {
            System.out.println("open browser name: "+browser);
        }
        public void closeBrowser()
        {
            System.out.println("close browser");
        }


}