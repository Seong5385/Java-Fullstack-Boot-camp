package class_.quiz;

import class_.quiz.classes.Monitor;

public class MonitorMain {
    public static void main(String[] args) {
        Monitor mo = new Monitor();
        System.out.println(mo.toString());

        mo.turnOnOff();

        System.out.println(mo.toString());
    }
}
