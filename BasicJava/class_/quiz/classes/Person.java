package class_.quiz.classes;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private int birth;

    public Person(String na, int ag) {
        this.name = na;
        this.age = ag;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", birth="
                + birth + "]";
    }
}
