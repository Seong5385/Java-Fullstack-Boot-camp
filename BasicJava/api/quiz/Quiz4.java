package api.quiz;

public class Quiz4 {

    public static void main(String[] args) {
        String[] member = {
                "hong,홍길동,30",
                "lee,이순신,40",
                "kim,김유신,50"
        };

        getName(member);
        avgAge(member);

    }

    public static void getName(String[] member) {
        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i].substring(member[i].indexOf(",") + 1, member[i].lastIndexOf(",")));
        }
    } // O(n)

    public static void avgAge(String[] member) {
        int sum = 0;

        for (int i = 0; i < member.length; i++) {
            sum += Integer.parseInt(member[i].substring(member[i].lastIndexOf(",") + 1, member[i].length()));
        }

        System.out.printf("평균 나이: %.1f", (double) sum / member.length);
    } // O(n)

}
