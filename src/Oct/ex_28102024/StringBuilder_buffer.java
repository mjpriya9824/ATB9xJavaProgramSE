package Oct.ex_28102024;

public class StringBuilder_buffer {

    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World");
       // System.out.println(str);
        StringBuffer sbf=new StringBuffer("Jyothi");
        sbf.append(" Priya");
        System.out.println("string buffer: "+sbf);

        sbf.reverse();
        System.out.println("string buffer reverse: "+sbf);

        sbf.replace(0,5,"Helloo");
        System.out.println("string buffer length: "+sbf.length());

        System.out.println("string buffer capacity: "+sbf.capacity());
        StringBuilder sbl = new StringBuilder("Hello");
        sbl.append("World");
        System.out.println("string builder: "+sbl);
        System.out.println("string builder reverse: "+sbl.reverse());
        System.out.println("string builder length: "+sbl.length());
        System.out.println("string builder capacity: "+sbl.capacity());

        StringBuilder sbl2=new StringBuilder("WELCOME TO JAVA CLASS");
        System.out.println(sbl2.delete(0,5));

        System.out.println(sbl2.insert(0,"WELCO"));
        sbl2.setCharAt(3,'j');
        System.out.println("string builder set char at: "+sbl2);
        System.out.println("string builder: "+sbl2);



    }

}
