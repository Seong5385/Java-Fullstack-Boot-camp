package collections.quiz;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            new Random().ints(1, 46).distinct().limit(6).forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        
        in.close();
    }
}
