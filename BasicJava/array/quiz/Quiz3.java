package array.quiz;

import java.util.Random;

public class Quiz3 {
    public static void main(String[] args) {
        int[][] lottos = new int[10][];

        for (int i = 0; i < lottos.length; i++) {
            int[] number = new Random().ints(1, 46).distinct().limit(6).sorted().toArray();
            for (int s : number)
                System.out.print(s + " ");

            System.out.println();
        }

    }
}
