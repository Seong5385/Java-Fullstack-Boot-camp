package collections.set;

import java.io.*;
import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) throws IOException {

        TreeSet<GymMember> gym = new TreeSet<>(
                new Comparator<GymMember>() {
                    @Override
                    public int compare(GymMember o1, GymMember o2) {
                        return Integer.compare(o1.getMemNum(), o2.getMemNum());
                    }
                });

        gym.add(new GymMember("박지성", 1000));
        gym.add(new GymMember("김연아", 1001));
        gym.add(new GymMember("싸이", 1002));
        gym.add(new GymMember("봉준호", 1003));
        gym.add(new GymMember("조현우", 1004));
        gym.add(new GymMember("BTS", 1005));
        gym.add(new GymMember("박찬호", 1006));
        System.out.println(gym);

        System.out.println("====================================");

        // ✅ 타입 맞춰야 함: GymMember2는 Comparable<GymMember2>니까 TreeSet<GymMember2>
        TreeSet<GymMember2> gym2 = new TreeSet<>();

        gym2.add(new GymMember2("박지성", 1000));
        gym2.add(new GymMember2("김연아", 1001));
        gym2.add(new GymMember2("싸이", 1002));
        gym2.add(new GymMember2("봉준호", 1003));
        gym2.add(new GymMember2("조현우", 1004));
        gym2.add(new GymMember2("BTS", 1005));
        gym2.add(new GymMember2("박찬호", 1006));
        System.out.println(gym2);
    }
}

class GymMember {
    private int memNum;
    private String name;
    private double height;
    private double weight;
    private int age;

    public GymMember(String name, int memberNum) {
        this.memNum = memberNum;
        this.name = name;
    }

    public int getMemNum() {
        return memNum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s, [%d]", name, memNum);
    }
}

class GymMember2 implements Comparable<GymMember2> {
    private int memNum;
    private String name;
    private double height;
    private double weight;
    private int age;

    public GymMember2(String name, int memberNum) {
        this.memNum = memberNum;
        this.name = name;
    }

    public int getMemNum() {
        return memNum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s, [%d]", name, memNum);
    }

    @Override
    public int compareTo(GymMember2 o) {
        return Integer.compare(this.memNum, o.memNum);
    }
}
