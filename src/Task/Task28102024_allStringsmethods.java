package Task;

public class Task28102024_allStringsmethods {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.substring(0,5));
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.contains("Hello"));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("Hello","Hi"));
        System.out.println(s.concat(" Java"));
        System.out.println(s.trim());
        System.out.println(s.split(" ")[0]);
        System.out.println(s.split(" ")[1]);
        System.out.println(s.isEmpty());
        System.out.println(s.equals("Hello World"));
        System.out.println(s.equalsIgnoreCase("hello world"));

    }

}
