package tipagem;

public class Equals {
    public static void run(Object a, Object b, Object c) {
        System.out.println("A e B: "+ a.equals(b));
        System.out.println("A e C: "+ a.equals(c));
    }
    public static void run(Object a, Object b) {
        System.out.println("A e B: "+ a.equals(b));
    }
}
