package stream;

public class Heater {
    private int currentTemp;
    private int targetTemp;

    public Heater(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getTargetTemp() {
        return targetTemp;
    }

}

class HeaterManager {
    public void run(Heater heater) {
        if (heater.getCurrentTemp() < heater.getTargetTemp()) {
            heater.setCurrentTemp(heater.getCurrentTemp() + 1);
        }
    }
}

class HeaterMain {
    public static void main(String[] args) {
        Heater heater = new Heater(10);

        System.out.println("최근 온도");
        System.out.printf("%d도 입니다.\n", heater.getCurrentTemp());

        System.out.println("올라간 후 온도");
        new HeaterManager().run(heater);

        System.out.printf("%d 도 입니다.", heater.getCurrentTemp());
    }
}
