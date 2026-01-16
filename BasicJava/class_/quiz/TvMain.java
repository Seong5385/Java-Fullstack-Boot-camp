package class_.quiz;

import class_.quiz.classes.Tv;

public class TvMain {
    public static void main(String[] args) {
        Tv t = new Tv();

        t.powerOnOff();
        t.moveChannel(50);
        t.getTvInfo();

        t.prevChannel();
        t.getTvInfo();

    }
}
