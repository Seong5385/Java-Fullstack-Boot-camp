package variable;

public class TextTypeExample {
    public static void main(String[] args) {
        char one = 'A';
        char tap = '\t';
        char ga = '\uAC00';
        String text = "\uD604\uC218";
        System.out.printf("%c, %c, %c, %s \ntest word\b ld!!", one, tap, ga, text);
        System.out.println("\n오늘 날씨는 좋아요, \"덕우\"씨");
    }
}
