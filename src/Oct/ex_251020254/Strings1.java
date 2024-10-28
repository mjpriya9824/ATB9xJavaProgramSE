package Oct.ex_251020254;

public class Strings1 {
    public static void main(String[] args)
    {
        String name="Jyothi Priya";
      //  name="jp";
        String str1="hello";
        String str2=new String("hello");
        String str3=new String("hello");
        System.out.println("str1==str2:"+str1==str2 );
        System.out.println("str1.equals(str2):"+str1.equals(str2) );
        System.out.println("str3==str2:"+str3==str2 );
        String name2=new String("Jyothi Priya");

        System.out.println("length of string: "+name.length());

    }
}
