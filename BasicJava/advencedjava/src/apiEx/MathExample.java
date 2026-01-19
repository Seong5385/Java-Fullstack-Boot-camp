package apiEx;

public class MathExample {

    public static void main(String[] args) {
        // Math 클래스의 메서드들...
        // abs(), ceil(), floor(), max(), min(), random()
        // rint() 현재 수에 가장 가까운 정수를 실수형태로 ...
        // round() 반올림

        // abs()
        System.out.println("Math.abs(10) = " + Math.abs(10));
        System.out.println("Math.abs(-10) = " + Math.abs(-10));
        System.out.println("Math.abs(3.1415) = " + Math.abs(3.1415));
        System.out.println("Math.abs(-3.1415) = " + Math.abs(-3.1415));

        // ceil()
        System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));
        System.out.println("Math.ceil(-5.4) = " + Math.ceil(-5.4));

        // floor()
        System.out.println("Math.floor(5.4) = " + Math.floor(5.4));
        System.out.println("Math.floor(-5.4) = " + Math.floor(-5.4));

        // max()
        System.out.println("Math.max(5,4) = " + Math.max(5, 4));

        // min()
        System.out.println("Math.min(5,4) = " + Math.min(5, 4));

        // random()
        System.out.println("Math.random() = " + Math.random());

        // rint()
        System.out.println("Math.rint(5.4) = " + Math.rint(5.4));
        System.out.println("Math.rint(-5.4) = " + Math.rint(-5.4));

        // round()
        System.out.println("Math.round(5.4) = " + Math.round(5.4));
        System.out.println("Math.round(-5.4) = " + Math.round(-5.4));

        System.out.println(Math.PI);

        // 원주율을 소수점 3자리로 반올림
        // 1. 곱하기 1000
        // 2. 그 결과에 round() 처리
        // 3. 2번에 결과를 1000으로 나눔
        double v1 = Math.PI * 1000;
        double v2 = Math.round(v1);
        double v3 = v2 / 1000.0;
        System.out.println(v3);

        System.out.println(Math.round(Math.PI * 1000) / 1000.0);

    }

}