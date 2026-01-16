package loop;

public class LoopEx1 {
    public static void main(String[] args) {
        forEx();
        whileEx();
    }

    public static void forEx() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void whileEx() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
        }
    }
}
