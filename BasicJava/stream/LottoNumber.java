package stream;

import java.io.*;
import java.util.Random;

public class LottoNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the count number: ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            new Random().ints(1, 46).distinct().limit(7).sorted().forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
    }
}
