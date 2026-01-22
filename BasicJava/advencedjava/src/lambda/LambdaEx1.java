package lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
        // FunctionalEx3 ie3 = (String name) -> {
        // System.out.println(name);
        // };

        FunctionalEx3 ie3 = name -> {
            System.out.println(name);
        };

        ie3.print("시발");

        LambdaEx4 ie4 = (x, y) -> x + y;
        System.out.println(ie4.cal(1, 6));

        new Outer().method();
    }
}

@FunctionalInterface
interface FunctionalEx3 {
    void print(String name);
}

@FunctionalInterface
interface LambdaEx4 {
    int cal(int x, int y);
}

@FunctionalInterface
interface LambdaEx5 {
    void method();
}

class Outer {
    public int iv = 10;

    void method() {
        final int iv = 50;
        LambdaEx5 f5 = () -> {
            System.out.println(Outer.this.iv);
            System.out.println(this.iv);
            System.out.println(iv);
        };

        f5.method();
    }
}
