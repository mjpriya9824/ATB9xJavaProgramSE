package Nov.ex14112024_Static;

public class StaticClass {
    public static void main(String args[])
{
    //Student1 s1=new Student1(3);
    //Student1 s2;
    new Student1(3);


}


}


class Student1{
    int age;
    static String s_name="LFHS";
    Student1(int age1)
    {
        this.age=age1;
    }
    {
        System.out.println("IIB");
        

    }

    static {
        System.out.println("static block");
    }

}
