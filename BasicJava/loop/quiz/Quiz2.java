package loop.quiz;

import java.util.Scanner;

public class Quiz2 {

    final int MaxCost = 30000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("분단위를 입력하세요: ");
        int min = in.nextInt();

        int cost = 3000;

        if (min > 60) {
            if (min % 60 == 0) {
                int r1 = (min / 60) * cost;
                if (r1 < 30000) {
                    System.out.printf("%,d원", r1);
                } else {
                    System.out.println("상한 초과");
                }
            }

            else if (min % 60 != 0) {

                if (min % 60 < 10) {
                    int r2 = ((min % 60) * 50) + (min / 60) * cost;
                    if (r2 < 30000) {
                        System.out.printf("%,d원", r2);
                    } else {
                        System.out.println("상한 초과");
                    }
                } else {

                    int r3 = (((min % 60) / 10) * 500) + (min / 60) * cost;
                    if (r3 < 30000) {
                        System.out.printf("%,d원", r3);
                    } else {
                        System.out.println("상한 초과");
                    }
                }
            }
        }

        else
            System.out.printf("%d원", cost - 3000);
        in.close();
    }
}
