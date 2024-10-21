package Oct.ex_10102024;

public class Variables2 {
    int inst_age; //instant variable
    static int st_age;

    public  static void main(String[] args)
    {
        int local_age;
        // System.out.println(local_age);  // gives error as we didn't assign local var

        local_age=25;
        System.out.println("local var "+local_age);
        System.out.println("static var "+st_age); // can be used without assigning variable also
        st_age=24;
        System.out.println("static var "+st_age); //static variables can be used without creating obj
        Variables2 v2=new Variables2();
        System.out.println("inst var "+v2.inst_age); // instant var can be used by creating obj

    }
}
