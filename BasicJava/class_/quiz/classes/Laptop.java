package class_.quiz.classes;

import interface_.Workable;

public class Laptop extends Computer implements Workable {
    public Laptop(String model) {
        super(model);
    }

    @Override
    public void performTask() {
        System.out.println(getModel() + "에서 휴대용 문서 작업을 시작합니다.");
    }

    public void checkBattery() {
        System.out.println(getModel() + "의 배터리 잔량을 확인합니다: 80%");
    }
}
