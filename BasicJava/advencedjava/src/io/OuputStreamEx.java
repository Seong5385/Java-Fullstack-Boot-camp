package io;

import java.io.*;

public class OuputStreamEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));

        System.out.print("파일명을 입력하세요: ");
        String fileName = br.readLine();
        String path = "C:\\Users\\tjoeun\\Java-Fullstack-Boot-camp\\BasicJava\\advencedjava\\src\\io\\";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + fileName))) {
            bw.write(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("읽을 파일 이름을 입력하세요: ");

        try (BufferedReader fileRead = new BufferedReader(new FileReader(path + br.readLine()))) {
            System.out.println(fileRead.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
