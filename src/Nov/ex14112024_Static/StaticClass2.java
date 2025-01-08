package Nov.ex14112024_Static;

public class StaticClass2 {
    public static void main(String args[])
{
    Student s1;


}


}


class Student{
    int age;
    static String s_name="LFHS";
    Student(int age1)
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
