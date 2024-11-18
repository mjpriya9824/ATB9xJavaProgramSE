package Nov.ex11112024_RevisionMain;

import Nov.ex_11112024.Revision.BaseClass;
import Nov.ex_11112024.Revision.TestCase1;

public class Revision_main {
    public static void main(String[] args)
    {
        TestCase1 tc1=new TestCase1(); // dynamic dispatch
        tc1.setBrowser("Chrome",true);
        String browser =tc1.getBrowser();
        tc1.StartTestCase1();
        System.out.println(tc1.getBrowser());





    }
}
