package io;

import java.io.*;

public class FileEx1 {
    public static void main(String[] args) {
        // String env_path = "C:\\Program Files (x86)\\VMware\\VMware
        // Workstation\\bin\\;C:\\Program Files\\Python310\\Scripts\\;C:\\Program
        // Files\\Python310\\;C:\\app\\tjoeun709\\product\\18.0.0\\dbhomeXE\\bin;C:\\Program
        // Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Program Files\\Eclipse
        // Adoptium\\jdk-8.0.312.7-hotspot\\bin;C:\\Program Files\\MariaDB
        // 10.6\\bin;C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\bin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program
        // Files (x86)\\Brackets\\command;C:\\Program
        // Files\\Java\\jdk1.8.0_333\\bin\\;C:\\Program
        // Files\\R\\R-4.1.3\\bin\\x64\\;C:\\Program Files\\Microsoft VS
        // Code\\bin;C:\\Program Files (x86)\\NetSarang\\Xshell 7\\;C:\\Program
        // Files\\MySQL\\MySQL Shell 8.0\\bin\\;C:\\Program Files\\MariaDB
        // 10.6\\bin;C:\\Users\\tjoeun709\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Program
        // Files\\Bandizip\\;C:\\Users\\tjoeun709\\AppData\\Local\\GitHubDesktop\\bin";
        // Arrays.stream(env_path.split(File.pathSeparator)).forEach(System.out::println);

        // System.out.println(env_path.split(File.pathSeparator).length);

        File abc = new File(
                "C:\\Users\\tjoeun\\Java-Fullstack-Boot-camp\\BasicJava\\advencedjava\\src\\files\\temp\\abc");

        if (abc.getParentFile().exists()) {
            abc.mkdir();
        }

        else {
            abc.mkdirs();
        }
        abc.mkdirs();
    }

}
