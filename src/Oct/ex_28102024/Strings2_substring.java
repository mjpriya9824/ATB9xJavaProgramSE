package Oct.ex_28102024;

public class Strings2_substring {

    public static void main(String[] args)
    {
        String name="Jyothi Priya";
        String s2="hello";
        String futball="Messi,Ronaldo,Neymar,Henry,Beckham";
        String s3=" jp ";
        String reg1="Hello123 priya9824";
        // in regular exp we are replacing all the nos with null

        System.out.println("regular exp 1: "+reg1.replaceAll("\\d+",""));
        String[] farr=futball.split(",");
        System.out.println(name.substring(6,12));
        System.out.println(name.substring(5));
        System.out.println("concat +: "+s2+" "+name);
        System.out.println("concat 2: "+s2.concat(" "+name));
        for(int i=0;i<farr.length;i++) {
            System.out.println("split : " + farr[i]);
        }
        System.out.println("chaAt: "+name.charAt(0));
        System.out.println("trim: "+s3.trim());
        System.out.println("replace: "+name.replace("Jyothi","Joey"));
        System.out.println("replace2: "+name.replace("y","Z"));
        System.out.println("replaceAll: "+name.replaceAll("y","Z"));

        System.out.println("contains: "+name.contains("Priya"));
        System.out.println("equals: "+name.equals("Jyothi Priya"));
        System.out.println("index of: "+name.indexOf("Priya"));
        System.out.println("first index of: "+name.indexOf("y"));  //returns first index
        System.out.println("last index of: "+name.lastIndexOf("y"));  //returns first index
        System.out.println("is empty: "+name.isEmpty());
        System.out.println("starts with: "+name.startsWith("Jyo"));

    }
}