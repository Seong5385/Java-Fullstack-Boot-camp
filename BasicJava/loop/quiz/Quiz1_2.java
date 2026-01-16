package loop.quiz;

public class Quiz1_2 {
    public static void main(String[] args) {
        System.out.println("====구구단 출력====");
        int n1 = 2;

        while (n1 < 10) {
            System.out.printf("%d단\n", n1);
            int n2 = 1;
            while (n2 < 10) {
                System.out.printf("%d X %d = %d\n", n1, n2, n1 * n2);
                n2++;
            }
            System.out.println();
            n1++;
        }
    }
}
