package class_.quiz.classes;

public class HumanMain {
    public static void main(String[] args) {
        Human h;

        System.out.println("*****".repeat(4) + " Human info " + "*****".repeat(4));
        h = new Human("홍길동", 15);
        System.out.println(h.toString());

        System.out.println("*****".repeat(4) + " Student info " + "*****".repeat(4));
        h = new Student("홍학생", 25, "컴퓨터 공학");
        System.out.println(h.toString());

        System.out.println("*****".repeat(4) + " Teacher info " + "*****".repeat(4));
        h = new Teacher("이름", 56, "Java");
        System.out.println(h.toString());

        System.out.println("*****".repeat(4) + " Employee info " + "*****".repeat(4));
        h = new Employee("null", 45, "si");
        System.out.println(h.toString());
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %s", this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Student extends Human {
    private String stdId;

    public Student(String n, int a, String s) {
        super(n, a);
        this.stdId = s;
    }

    void singing() {
        System.out.println("노래방에서 노래를 합니다.");
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %s, 학과: %s", super.getName(), super.getAge(), this.stdId);
    }
}

class Teacher extends Human {
    private String sub;

    public Teacher(String name, int age, String s) {
        super(name, age);
        this.sub = s;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %s, 과목: %s", super.getName(), super.getAge(), this.sub);
    }
}

class Employee extends Human {
    private String department;

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.department = dept;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 나이: %s, 부서: %s", super.getName(), super.getAge(), this.department);
    }
}
