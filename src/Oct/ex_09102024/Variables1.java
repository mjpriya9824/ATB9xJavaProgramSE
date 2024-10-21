package Oct.ex_09102024;

public class Variables1 {
    int inst_var;   // instance variable
    static int static_var=200;  //static variable
    public  Variables1()
    {
        this.inst_var=100;
    }

    public static void main(String[] args)
    {
        int age =10; //local variable


            int b=30;
            System.out.println(b);   //local
        Variables1 v1=new Variables1();
        System.out.println(v1.inst_var);  // instance variable

        System.out.println(Variables1.static_var); // static var can be accessed without obj creation




    }

}
