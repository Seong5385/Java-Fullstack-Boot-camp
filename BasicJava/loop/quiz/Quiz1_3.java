package loop.quiz;

public class Quiz1_3 {
    public static void main(String[] args) {
        System.out.println("====구구단 출력====");
        int n1 = 1;

        while (n1 < 10) {

            int n2 = 2;
            while (n2 < 10) {
                System.out.printf("%d X %d = %d\t", n2, n1, n1 * n2);
                n2++;
            }
            System.out.println();
            n1++;
        }
    }
}
