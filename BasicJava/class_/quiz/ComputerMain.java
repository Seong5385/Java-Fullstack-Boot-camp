package class_.quiz;

import class_.quiz.classes.*;

public class ComputerMain {
    public static void main(String[] args) {
        TechManager manager = new TechManager();

        Laptop myGram = new Laptop("LG Gram");
        Desktop myGamingPC = new Desktop("Alienware");

        // 다형성 테스트 1: 부팅
        manager.bootDevice(myGram);
        manager.bootDevice(myGamingPC);

        // 다형성 테스트 2: 작업 실행
        manager.executeWork(myGram);
        manager.executeWork(myGamingPC);

        // 다형성 테스트 3: 고유 기능 확인
        System.out.println("\n--- 상세 기능 점검 ---");
        manager.checkSpecialFeature(myGram);
        manager.checkSpecialFeature(myGamingPC);
    }
}
