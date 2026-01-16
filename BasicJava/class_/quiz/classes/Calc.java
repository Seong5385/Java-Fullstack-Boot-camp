package class_.quiz.classes;

public class Calc {
    private double num1;
    private double num2;

    public Calc(double n1, double n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public int sum() {
        return (int) (num1 + num2);
    }

    public int sub() {
        return (int) (num1 - num2);
    }

    public int mul() {
        return (int) (num1 * num2);
    }

    public double div() {
        return num1 / num2;
    }
}
