package baekjoon.MapSet;

import java.io.*;
import java.util.*;

public class Q7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> employee = new HashMap<>();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            employee.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        employee.entrySet().stream().filter(v -> v.getValue().equals("enter")).sorted(Map.Entry.<String, String>comparingByKey().reversed()).forEach(k -> sb.append(k.getKey()).append("\n"));
        System.out.println(sb);
    }
}
