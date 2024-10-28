package Task;

public class Toget_datatype {
    public static void main(String[] args) {
        int a = 10;
        double b = 10.5;
        char c='j';
        String s="hello";
        // For primitive types, we need to use their wrapper classes
        System.out.println("Type of a: " + ((Object)a).getClass().getSimpleName());
        System.out.println("Type of b: " + ((Object)b).getClass().getSimpleName());
        System.out.println("Type of c: " + ((Object)c).getClass().getSimpleName());
        System.out.println("Type of s: " + ((Object)s).getClass().getSimpleName());
        // Alternatively, you can use the following:
       // System.out.println("Type of a: " + Integer.class.getSimpleName());
       // System.out.println("Type of b: " + Double.class.getSimpleName());
    }
}
