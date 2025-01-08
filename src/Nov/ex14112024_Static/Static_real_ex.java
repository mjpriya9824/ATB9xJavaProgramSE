package Nov.ex14112024_Static;

public class Static_real_ex {
public static void main(String[] args)
{
    ATB A=new ATB("jp");
    ATB A1=new ATB("Rahul");
    ATB a2;
   new ATB("priya");
    A1.readDocs();
    A.readDocs();
   ATB.doAssignment();//staic method
System.out.println(ATB.course); //static variable
}

}



class ATB{


    {
        System.out.println("reading from CSV FILE");
    }

    static {
        System.out.println("load the class?,I will execute");

    }
    private String name;
    private String phone;
    static String course="ATB SDET";

    public ATB(String name) {
        this.name = name;
    }

    void readDocs()
    {
        System.out.println("non static method");
        System.out.println(course);
        //System.out.println(phone);

    }
    static void doAssignment()
    {
        //System.out.println(phone);  Static funcs cannot access instance variable
        System.out.println("do assignment");
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getName(){
        return name;
    }


}