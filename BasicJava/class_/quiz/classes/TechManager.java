package class_.quiz.classes;

import interface_.Powerable;
import interface_.Workable;

public class TechManager {
    // 인터페이스 다형성: 어떤 Powerable 기기든 처리 가능
    public void bootDevice(Powerable p) {
        System.out.println("[시스템 부팅 시작]");
        p.powerOn();
    }

    // 인터페이스 다형성: 어떤 Workable 기기든 처리 가능
    public void executeWork(Workable w) {
        w.performTask();
    }

    // instanceof를 이용한 타입 판별 및 다운캐스팅
    public void checkSpecialFeature(Powerable p) {
        if (p instanceof Laptop) {
            ((Laptop) p).checkBattery();
        }

        else if (p instanceof Desktop) {
            ((Desktop) p).overclock();
        }
    }
}
