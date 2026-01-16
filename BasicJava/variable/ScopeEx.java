package variable;

public class ScopeEx {
    static int n; // 필드

    public static void main(String[] args) {

        String name;
        String email;

        if (true) {
            name = "홍길동";
            email = "honggildong@naver.com";
        }

        System.out.println(n);
        System.out.printf("%s, %s", name, email);

        n = 10;

        System.out.println();
        test();

    }

    public static void test() {
        System.out.println(ScopeEx.n);
    }

}