package Nov.ex14112024_Static;

public class StaticClass_real2 {
    public static void main(String args[])
{
    Student2 s1=new Student2(3);
    Student2 s3=new Student2(26);

    System.out.println(Student2.s_name);
    //Student2.s_name="lfhd";
    System.out.println(s1.age);
    System.out.println(s1.s_name);
    System.out.println(s3.s_name);




}


}


class Student2{
    int age;
    static String s_name="LFHS";
    Student2 (int age1)
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
