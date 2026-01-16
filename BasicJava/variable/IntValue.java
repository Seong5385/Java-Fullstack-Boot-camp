package variable;

public class IntValue {
    public static void main(String[] args) {
        int dic = 7;
        int bin = 0b1000_0101;
        int oct = 070;
        int hex = 0xFEFE;

        System.out.printf("%d, %d, %o, %d", dic, bin, oct, hex);
    }
}
