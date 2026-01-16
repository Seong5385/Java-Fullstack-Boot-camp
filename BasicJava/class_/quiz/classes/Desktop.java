package class_.quiz.classes;

import interface_.Workable;

public class Desktop extends Computer implements Workable {
    public Desktop(String model) {
        super(model);
    }

    @Override
    public void performTask() {
        System.out.println(getModel() + "에서 고성능 그래픽 작업을 시작합니다.");
    }

    void overclock() {
        System.out.println(getModel() + "의 CPU를 오버클럭하여 성능을 높입니다.");
    }
}
