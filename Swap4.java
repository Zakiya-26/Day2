public class Swap4 {
    public static void main(String[] args) {
        int a=2;
        int b=81;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);

    }
}
