package control;

import java.io.*;
import java.util.*;

public class SwitchEx2 {
    public static void main(String[] args) throws IOException {
        System.out.print("int, long, double, String, boolean 순으로 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int intNum = Integer.parseInt(st.nextToken());
        long longNum = Long.parseLong(st.nextToken());
        double doubleNum = Double.parseDouble(st.nextToken());
        String str = st.nextToken();
        boolean bool = Boolean.parseBoolean(st.nextToken());

        System.out.println(fomatterPaternswitch(intNum));
        System.out.println(fomatterPaternswitch(longNum));
        System.out.println(fomatterPaternswitch(doubleNum));
        System.out.println(fomatterPaternswitch(str));
        System.out.println(fomatterPaternswitch(bool));
    }

    public static String fomatterPaternswitch(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            case null -> "Null value";
            default -> obj.toString();
        };
    }
}
