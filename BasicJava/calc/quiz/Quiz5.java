package calc.quiz;

public class Quiz5 {
    public static void main(String[] args) {
        int year = 2028;
        System.out.println((year % 4 == 0 && year % 400 == 0 || year % 100 != 0) ? true : false);
    }
}
