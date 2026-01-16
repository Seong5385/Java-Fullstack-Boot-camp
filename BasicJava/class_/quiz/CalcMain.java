package class_.quiz;

import class_.quiz.classes.Calc;

public class CalcMain {
    public static void main(String[] args) {
        Calc c = new Calc(3, 4);

        System.out.printf("%d\n", c.sum());
        System.out.printf("%d\n", c.sub());
        System.out.printf("%d\n", c.mul());
        System.out.printf("%.2f", c.div());
    }
}