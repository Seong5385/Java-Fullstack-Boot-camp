package loop;

import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("문자열 입력: ");
            String text = in.nextLine();

            if (text.equals("quit"))
                break;

            System.out.println(text);
        }

        in.close();
    }
}
