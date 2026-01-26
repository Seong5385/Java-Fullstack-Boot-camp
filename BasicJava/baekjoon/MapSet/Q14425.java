package baekjoon.MapSet;

import java.io.*;
import java.util.*;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count1 = Integer.parseInt(st.nextToken());
        int count2 = Integer.parseInt(st.nextToken());

        Set<String> sen = new HashSet<>();

        for(int i=0; i<count1; i++) {
            sen.add(br.readLine());
        }

        int count = 0;
        for(int i=0; i<count2; i++) {
            if(sen.contains(br.readLine()))
                count++;
        }

        System.out.println(count); 
    }
}
