package calc;

public class OpEx5 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(10 | 15);

        System.out.println(Integer.toBinaryString(~10));
        System.out.println(Integer.toBinaryString(~10).length());

        System.out.println(Integer.parseUnsignedInt("11111111111111111111111111110101", 2));

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(10 << 2));
    }
}
