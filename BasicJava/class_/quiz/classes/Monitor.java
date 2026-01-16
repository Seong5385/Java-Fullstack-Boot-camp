package class_.quiz.classes;

public class Monitor {
    private int resolution;
    private int lange;
    private int bright;
    private String state;

    public Monitor() {
        this.resolution = 100;
        this.lange = 100;
        this.bright = 100;
        this.state = "off";
    }

    public String turnOnOff() {
        if (state.equals("off"))
            state = "on";

        else
            state = "off";

        return state;
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %d, %s", resolution, lange, bright, state);
    }
}
