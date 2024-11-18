package Nov.ex_12112024_Abstarction;

public class AbstractClass {
}

class Priya extends Loan
{
    @Override
    void loan30k() {
        System.out.println("give 30k loan");
    }

    @Override
    void loan50k() {
        System.out.println("give 50k loan");
    }
}


abstract class Loan
{
    abstract void loan50k();
    abstract void loan30k();
    void loan()
    {
        System.out.println("only loan is given");
    }
}






