package calc.quiz;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price = in.nextInt();

        int oman = price / 50000;
        int ilman = (price % 50000) / 10000;
        int ochun = (price % 10000) / 5000;
        int ilchun = (price % 5000) / 1000;

        System.out.printf("5만원: %d장\n1만원: %d장\n5천원: %d장\n1천원: %d장\n", oman, ilman, ochun, ilchun);

        in.close();
    }
}
