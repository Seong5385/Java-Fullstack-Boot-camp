package exception;

public class RuntimeExceptionExample {

    // RuntimeException 예제1
    // 0으로 나눌 때 발생하는 예외
    // ArithmeticException: / by zero
    public static int makeException1(int input) {
        int divide = 0; // 예외 처리...
        int result = input / divide;
        return result;
    }

    // StringIndexOutOfBoundsException: Index 1 out of bounds for length 1
    public static void makeException2() {
        String s = "가";
        System.out.println(s.charAt(1)); // index 바깥을 참조
    }

    // ArrayIndexOutOfBoundsException
    public static void makeException3() throws Exception {
        // throws 사용시 예외는 main에서 처리
        int[] a = { 1, 2, 3 };
        System.out.println(a[3]); // index 바깥을 참조
    }

    // NullPointerException
    @SuppressWarnings("null")
    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split("")); // nothing에 null로 객체가 없음
    }

    // NumberFormatException
    public static void makeException5() {
        String notInt = "가나다";
        @SuppressWarnings("unused")
        int a = Integer.parseInt(notInt); // 숫자 형태의 문자가 아님
    }

    // outofmemory
    public static void makeException6() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) { // 무한 반복으로 인한 오류... 시스템 메모리 아웃
            makeException6();
        }
    }

    // ArrayStoreException: java.lang.Integer
    public static void makeException7() {
        Object[] objArr = new String[3];
        objArr[0] = 0; // String에 0 을 입력하려는 오류. 타입X
    }

    // ClassCastException
    public static void makeException8() {
        Object[] objArr = new String[3];
        objArr[0] = "0";
        @SuppressWarnings("unused")
        Integer a = (Integer) objArr[0]; // String을 Integer로 형변환 하려고 하는 오류.
    }

    public static void main(String[] args) throws Exception {
        System.out.println("테스트 중!!!");
        try { // 블럭내에 있는 값에 예외를 탐지
            makeException1(10);
            // makeException2();
            // makeException3();
            // makeException4();
            // makeException5();
            // makeException6();
            // makeException7();
            // makeException8();
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption1 예외");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption2 예외");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption3 예외");
        } catch (NumberFormatException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption4 예외");
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption5 예외");
        } catch (ArrayStoreException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption7 예외");
        } catch (ClassCastException e) {
            System.out.println(e.getClass());
            System.out.println("makeExecption8 예외");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main 프로그램 종료");

    }
}
