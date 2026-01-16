package class_.classes;

public class StaticInit {

    public static void main(String[] args) {
        System.out.println(Parent.getMax());
    }

    static int num;

    static {
        System.out.println("static init turn on");
        num = 1000;
        System.out.println(num);
    }

    StaticInit() {
        System.out.println("constracture turn on ");
    }
}

class Parent {
    private static final int MAX = 100;

    public static int getMax() {
        return MAX;
    }
}
