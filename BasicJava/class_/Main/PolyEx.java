package class_.Main;

public class PolyEx {
    public static void main(String[] args) {
        Person p;

        p = new Student("sibal", 25, 12345678);
        p = new Teacher("byungsin", 56, "Java");
        p = new Employee("emi", 55, "shit");

        Person[] pArr = new Person[4];

        pArr[0] = new Person("jot", 15);
        pArr[1] = new Student("sibal", 24, 123456);
        pArr[2] = new Teacher("gebyung", 56, "java");
        pArr[3] = new Employee("sinSkki", 57, "si");

        for (Person n : pArr) {
            System.out.println(n);
        }

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.printf("%s가 걸어갑니다", name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Student extends Person {
    private int stdId;

    public Student(String n, int a, int s) {
        super(n, a);
        this.stdId = s;
    }

    void singing() {
        System.out.println("노래방에서 노래를 합니다.");
    }

    @Override
    void walk() {
        System.out.printf("학생인 %s가 걸어갑니다\n학번은 %d입니다.", super.getName(), this.stdId);
    }

    @Override
    public String toString() {
        return "Student [stdId=" + stdId + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}

class Teacher extends Person {
    private String sub;

    public Teacher(String name, int age, String s) {
        super(name, age);
        this.sub = s;
    }

    @Override
    void walk() {
        System.out.printf("선생인 %s가 걸어갑니다\n학과은 %s입니다.", super.getName(), this.sub);
    }

    @Override
    public String toString() {
        return "Teacher [sub=" + sub + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}

class Employee extends Person {
    private String department;

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.department = dept;
    }

    @Override
    void walk() {
        System.out.printf("직장인인 %s가 걸어갑니다\n부서는 %s입니다.", super.getName(), this.department);
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", getName()=" + getName() + ", getAge()=" + getAge()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
