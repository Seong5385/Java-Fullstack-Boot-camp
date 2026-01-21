package collections.list;

import java.util.*;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format(name + " : " + score);
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        student.add(new Student("홍길동", 98));
        student.add(new Student("이름", 90));
        student.add(new Student("안녕", 85));

        student.forEach(System.out::println);
    }
}
