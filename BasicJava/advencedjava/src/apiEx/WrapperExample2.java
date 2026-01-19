package apiEx;

public class WrapperExample2 {

      public static void main(String[] args) {
            // 문자형을 기본 자료형으로 변환
            String s1 = "10";
            String s2 = "5.43";

            int a = Integer.parseInt(s1);
            // int d = Integer.parseInt(s2); //java.lang.NumberFormatException
            double b = Double.parseDouble(s2);
            float c = Float.parseFloat("4.53");

            System.out.println(
                        (int) ((a + b + c) * 100) / 100.0);

            int d = Integer.valueOf(s1);
            int e = new Integer(s1).intValue();
            System.out.println(d + e);
      }

}
