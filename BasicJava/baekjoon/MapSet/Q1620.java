package baekjoon.MapSet;

import java.io.*;
import java.util.*;

public class Q1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> poke = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        poke.add(0, null);

        for(int i=1; i<=n; i++) {
            poke.add(br.readLine());
        }

        StringBuilder sb= new StringBuilder();

        for(int i=0; i<m; i++) {
            String s = br.readLine();
            if(s.chars().allMatch(Character::isDigit)) {
                sb.append(poke.get(Integer.parseInt(s))).append("\n");
            }

            else {
                sb.append(poke.indexOf(s)).append("\n");
            }
        }

        System.out.println(sb);

        
    }
}
