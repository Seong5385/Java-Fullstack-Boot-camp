package apiEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMethodEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str.substring(0, str.length() - 1));

        System.out.println(String.valueOf('a'));
    }
}
