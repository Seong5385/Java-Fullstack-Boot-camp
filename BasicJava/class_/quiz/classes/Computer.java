package class_.quiz.classes;

import interface_.Powerable;

public class Computer implements Powerable {
    private String model;
    private boolean isRunning;

    public Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void powerOn() {
        isRunning = true;
        System.out.println(model + "의 전원이 켜졌습니다.");
    }

    @Override
    public void powerOff() {
        isRunning = false;
        System.out.println(model + "의 전원이 꺼졌습니다.");
    }

}
