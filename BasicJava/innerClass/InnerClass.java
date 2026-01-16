package innerClass;

public class InnerClass {
    int i = 10;

    void outerMethod() {
        class Inner {
            private int x = 20;
            private int i = 30;

            public int getx() {
                return x;
            }

            public int geti() {
                return i;
            }

        }
        Inner in = new Inner();
        System.out.println(in.getx());
        System.out.println(in.geti());
    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass();
        in.outerMethod();

        A a = new A();
        a.method();

        A.B b = new A.B();
        b.method1();
        b.var1 = 3;

        A.B.var2 = 3;
        A.B.method2();

        A.C c = a.new C();
        c.method1();

        a.method();
    }

}

class A {
    static class B {

        int var1;
        static int var2;

        B() {
            System.out.println("C객체 생성");
        }

        void method1() {
            System.out.println("static inner class method1()");
        }

        static void method2() {
            System.out.println("static inner class method2()");
        }
    }

    public class C {
        int var1;

        C() {
            System.out.println("B객체 생성");
        }

        void method1() {
            System.out.println("instance inner class method1()");
        }
    }

    A() {
        System.out.println("A 객체 생성");
    }

    void method() {
        class D {
            @SuppressWarnings("unused")
            int var1;

            D() {
                System.out.println("local inner class D object construct");
            }

            void method1() {
                System.out.println("local inner class method1()");
            }
        }

        D d = new D();
        d.var1 = 3;
        d.method1();
    }
}
