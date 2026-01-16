package calc;

public class OpEx2 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 10;

        int c = ++a;
        int d = b--;

        System.out.printf("%d, %d\n", a, c);
        System.out.printf("%d, %d", b, d);
    }
}
