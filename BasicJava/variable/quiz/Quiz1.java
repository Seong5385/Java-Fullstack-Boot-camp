package variable.quiz;

public class Quiz1 {
    public static void main(String[] args) {
        String name1, name2, name3;
        name1 = "김동완";
        name2 = "서지수";
        name3 = "이지은";

        int a1, a2, a3;
        a1 = 38;
        a2 = 24;
        a3 = 25;

        String p1, p2, p3;
        p1 = "010-1111-1111";
        p2 = "010-1234-5678";
        p3 = "010-2525-2345";

        int m1, m2, m3;
        m1 = 20000;
        m2 = 30000;
        m3 = 50000;

        System.out.println("이름\t나이\t\t전화번호\t\t회비");
        System.out.printf("%s\t%d\t\t%s\t\t%,d\n", name1, a1, p1, m1);
        System.out.printf("%s\t%d\t\t%s\t\t%,d\n", name2, a2, p2, m2);
        System.out.printf("%s\t%d\t\t%s\t\t%,d\n", name3, a3, p3, m3);
        System.out.printf("총합계\t\t\t\t\t\t%,d", m1 + m2 + m3);

    }
}
