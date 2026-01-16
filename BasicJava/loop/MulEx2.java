package loop;

public class MulEx2 {
    public static void main(String[] args) {
        System.out.println("====구구단 출력====");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d단\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }

            System.out.println();
        }
    }
}
