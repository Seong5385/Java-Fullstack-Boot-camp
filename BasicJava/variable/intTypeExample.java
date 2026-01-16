package variable;

public class intTypeExample {
    public static void main(String[] args) {
        byte a = (byte) 128;
        short b = (short) 32768;
        int c = 2147483647;
        long d = 999999999999999999L;

        System.out.printf("%d, %d, %d, %d", a, b, c, d);
    }
}
