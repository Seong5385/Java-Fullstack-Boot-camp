package variable;

public class Casting {
    public static void main(String[] args) {
        double pi = Math.PI;
        int pi2 = (int) Math.PI;

        System.out.println(((Object) pi).getClass());
        System.out.println(((Object) pi2).getClass());
        System.out.println(pi2);

        double score = 100;
        int score2 = (int) 100;
        System.out.println(((Object) score).getClass());
        System.out.println(((Object) score2).getClass());

        casting();
    }

    public static void casting() {
        short n1 = 3291;
        byte n2 = (byte) n1;
        System.out.print(n2);
    }
}
