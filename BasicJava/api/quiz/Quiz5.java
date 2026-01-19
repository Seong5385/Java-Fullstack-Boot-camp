package api.quiz;

import java.util.*;

public class Quiz5 {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("1) 가위 2) 바위 3) 보");
                System.out.print("당신의 선택은?: ");

                int input = in.nextInt();

                if (input < 0 || input > 3) {
                    throw new Exception("재대로 안넣을래?");
                }

                new Random().ints(1, 4).limit(1).forEach(r -> System.out.println(result(input, r)));

                System.out.print("다시 시작 할건가요(Y/N): ");
                String c = in.next();
                if (c.toUpperCase().equals("N")) {
                    break;
                }
                System.out.println();
            }

            in.close();
        }
    }

    private static String result(int user, int com) {

        if (user == com) {
            return "비겼습니다." + "\n";
        }

        else if ((user == 1 && com == 3) ||
                (user == 2 && com == 1) ||
                (user == 3 && com == 2)) {
            return "당신이 이겼습니다!" + "\n";
        }

        else {
            return "컴퓨터가 이겼습니다!" + "\n";
        }
    }
}
