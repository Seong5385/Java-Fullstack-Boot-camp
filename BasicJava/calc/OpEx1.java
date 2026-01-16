package calc;

public class OpEx1 {
    public static void main(String[] args) {
        double n = Math.PI * 10000;
        double n2 = (int) n / 10000.0;

        System.out.println(n2);

        long a1 = 1000000000;
        long a2 = 1000000000;

        long a3 = a1 * a2;

        System.out.printf("%,d", a3);
    }
}
