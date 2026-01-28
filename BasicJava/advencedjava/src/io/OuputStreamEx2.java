package io;

import java.io.*;

public class OuputStreamEx2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\tjoeun\\Java-Fullstack-Boot-camp\\BasicJava\\advencedjava\\src\\files\\temp\\";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "aaa.txt"))) {
            bw.write("hello world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
